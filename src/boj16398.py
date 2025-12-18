def get_min_vertex(dist, selected):
    minv, mindist = -1, float("inf")
    for i in range(len(dist)):
        if not selected[i] and dist[i] < mindist:
            minv, mindist = i, dist[i]
    return minv

def prim(matrix):
    m = len(matrix)
    dist = [0] + [float("inf")] * (m - 1)
    found = [False] * m
    for _ in range(m):
        u = get_min_vertex(dist, found)
        found[u] = True
        for w in range(m):
            if not found[w] and matrix[u][w] != float("inf") and matrix[u][w] < dist[w]:
                dist[w] = matrix[u][w]
    return dist

vertex_len = int(input())
way_matrix = [list(map(int, input().split())) for _ in range(vertex_len)]
print(sum(prim(way_matrix)))
