n, m = map(int, input().split())
pwd_map = dict()

for _ in range(n):
    tmp = input().split()
    pwd_map[tmp[0]] = tmp[1]

for _ in range(m):
    print(pwd_map[input()])
