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
vertex_position = [list(map(float, input().split())) for _ in range(vertex_len)]
way_matrix = [[0 for _ in range(vertex_len)] for _ in range(vertex_len)]

for a in range(vertex_len):
    for b in range(vertex_len):
        if a != b:
            way_matrix[a][b] = ((vertex_position[a][0] - vertex_position[b][0]) ** 2 + (vertex_position[a][1] - vertex_position[b][1]) ** 2) ** 0.5

print(sum(prim(way_matrix)))
