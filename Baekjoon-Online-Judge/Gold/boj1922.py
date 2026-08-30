import sys

def getMinVertex(dist, selected):
    minv, mindist = -1, float("inf")
    for i in range(len(dist)):
        if not selected[i] and dist[i] < mindist:
            minv, mindist = i, dist[i]
    return minv

def prim(matrix):
    m = len(matrix)

    dist = [float("inf")] * m
    found = [False] * m
    dist[0] = 0

    for _ in range(m):
        u = getMinVertex(dist, found)
        found[u] = True
        for w in range(m):
            if not found[w] and matrix[u][w] != float("inf") and matrix[u][w] < dist[w]:
                dist[w] = matrix[u][w]

    return dist

vertex_len = int(sys.stdin.readline())
way_matrix = [[0 if x == y else float("inf") for y in range(vertex_len)] for x in range(vertex_len)]
for _ in range(int(sys.stdin.readline())):
    start, end, cost = list(map(int, sys.stdin.readline().strip().split()))
    way_matrix[start - 1][end - 1] = cost
    way_matrix[end - 1][start - 1] = cost

print(sum(prim(way_matrix)))
