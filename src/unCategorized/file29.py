import sys

n = int(sys.stdin.readline())
xy_list = sorted(
    [list(map(int, sys.stdin.readline().split())) for _ in range(n)],
    key=lambda x: (x[1], x[0])
)

for xy in xy_list:
    print(xy[0], xy[1])
