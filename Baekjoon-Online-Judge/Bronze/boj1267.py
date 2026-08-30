import math
import sys

sys.stdin.readline()
arr = map(int, sys.stdin.readline().split())

y, m = 0, 0

for item in arr:
    y += math.floor(item / 30) * 10 + 10
    m += math.floor(item / 60) * 15 + 15

if y == m:
    print("Y M", y)
elif y > m:
    print("M", m)
else:
    print("Y", y)
