#!/usr/bin/env python3
"""Find a download link for an exact app version in an APKPure app_version API response.

Usage: apkpure.py <response.bin> <version-name> [<arch>]
       apkpure.py <response.bin> --versions
Prints "<APK|XAPK> <url>" (exit 0) or nothing (exit 1). --versions prints all version names.

The response is protobuf without a published schema, so the message tree is walked generically:
the smallest message that contains both the exact version name and a winudf.com APK/XAPK link is the
entry for that version.
"""
import re
import sys

URL_RE = re.compile(r'^https://(?:[a-z0-9.-]*winudf\.com|download\.pureapk\.com/b)/(APK|XAPK)/')
VER_RE = re.compile(r'^\d+(\.\d+)+(-[A-Za-z0-9_.-]+)?$')


def varint(b, i):
    r = s = 0
    while True:
        if i >= len(b):
            raise ValueError
        c = b[i]
        i += 1
        r |= (c & 0x7F) << s
        s += 7
        if c < 0x80:
            return r, i
        if s > 63:
            raise ValueError


def parse(b, depth=0):
    """Returns a node: list of children (str for strings, list for messages) or None if b is not a message."""
    if depth > 40 or not b:
        return None
    i, out = 0, []
    while i < len(b):
        key, i = varint(b, i)
        wt = key & 7
        if key >> 3 == 0:
            raise ValueError
        if wt == 0:
            _, i = varint(b, i)
        elif wt == 1:
            i += 8
        elif wt == 5:
            i += 4
        elif wt == 2:
            ln, i = varint(b, i)
            if i + ln > len(b):
                raise ValueError
            chunk = b[i:i + ln]
            i += ln
            sub = None
            try:
                sub = parse(chunk, depth + 1)
            except ValueError:
                sub = None
            if sub:
                out.append(sub)
            try:
                s = chunk.decode('utf-8')
                if s.isprintable():
                    out.append(s)
            except UnicodeDecodeError:
                pass
        else:
            raise ValueError
        if i > len(b):
            raise ValueError
    return out


def strings(node):
    for c in node:
        if isinstance(c, str):
            yield c
        else:
            yield from strings(c)


def best(node, version, arch):
    """Smallest subtree with the version and a download link."""
    found = None
    for c in node:
        if isinstance(c, list):
            r = best(c, version, arch)
            if r:
                found = r if not found or len(r[2]) < len(found[2]) else found
    if found:
        return found
    ss = list(strings(node))
    if version in ss:
        for s in ss:
            m = URL_RE.match(s)
            if m:
                return (m.group(1), s, ss)
    return None


def main():
    data = open(sys.argv[1], 'rb').read()
    try:
        tree = parse(data)
    except ValueError:
        tree = None
    if not tree:
        sys.exit(1)
    if sys.argv[2] == '--versions':
        for v in sorted({s for s in strings(tree) if VER_RE.match(s)}):
            print(v)
        return
    r = best(tree, sys.argv[2], sys.argv[3] if len(sys.argv) > 3 else '')
    if not r:
        sys.exit(1)
    print(r[0], r[1])


if __name__ == '__main__':
    main()
