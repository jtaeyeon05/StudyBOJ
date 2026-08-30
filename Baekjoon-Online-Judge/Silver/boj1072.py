import sys
import math

a, b = map(int, sys.stdin.readline().split())
c = 100 * b // a

if c >= 99:
    sys.stdout.write("-1")
else:
    d = (-a * c - a + 100 * b) / (c - 99)
    print(math.ceil(d))
