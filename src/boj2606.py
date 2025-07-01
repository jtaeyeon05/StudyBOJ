n = int(input())
m = int(input())
gr = [[] for _ in range(n + 1)]

for _ in range(m):
    a, b = map(int, input().split())
    gr[a].append(b)
    gr[b].append(a)

queue = [1]
visited = set()
while queue:
    now = queue.pop(0)
    if now not in visited:
        visited.add(now)
        for item in gr[now]:
            queue.append(item)

print(len(visited) - 1)
