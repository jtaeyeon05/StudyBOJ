import sys

n, m = map(int, input().split())
pkm_list = [""]
pkm_map = dict()

for i in range(1, n + 1):
    tmp = sys.stdin.readline()
    pkm_list.append(tmp)
    pkm_map[tmp] = i

result = []
for _ in range(m):
    tmp = sys.stdin.readline()
    if tmp[0] in list("1234567890"):
        result.append(pkm_list[int(tmp)].strip())
    else:
        result.append(str(pkm_map[tmp]))
sys.stdout.write("\n".join(result))
