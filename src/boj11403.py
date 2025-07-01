import sys

n = int(input())
gr = []

for _ in range(n):
    road = []
    read = list(map(int, sys.stdin.readline().split()))
    for i in range(n):
        if read[i] == 1:
            road.append(i)
    gr.append(road)

result = []
for i in range(n):
    row = []
    for j in range(n):
        found = "0"
        queue = gr[i][:]
        visited = set()
        while queue:
            now = queue.pop(0)
            if now not in visited:
                visited.add(now)
                if now == j:
                    found = "1"
                    break
                queue += gr[now]
        row.append(found)
    result.append(row)

sys.stdout.write("\n".join(map(lambda x: " ".join(x), result)))
