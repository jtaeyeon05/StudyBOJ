import sys
inp = sys.stdin.readline
n, m = map(int, inp().split())
target = list(map(int, inp().split()))
t1 = [0, target[0]]
for i in range(1, n):
    t1.append(t1[-1] + target[i])

result = list()
for _ in range(m):
    k = inp().split()
    result.append(str(t1[int(k[1])] - t1[int(k[0]) - 1]))
sys.stdout.write("\n".join(result))
