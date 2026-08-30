import math, sys
n = int(sys.stdin.readline())
sug = sorted([int(sys.stdin.readline()) for _ in range(n)])
p15 = math.floor(n * 0.15 + 0.5)
if n == 0:
    print(0)
else:
    print(math.floor(sum(sug[p15:len(sug)-p15])/(len(sug)-2*p15) + 0.5))
