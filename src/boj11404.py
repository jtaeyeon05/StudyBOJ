import copy

def floyd_warshall(matrix, length):
    result_matrix = copy.deepcopy(matrix)
    for k in range(length):
        for i in range(length):
            for j in range(length):
                if result_matrix[i][k] + result_matrix[k][j] < result_matrix[i][j]:
                    result_matrix[i][j] = result_matrix[i][k] + result_matrix[k][j]
    return result_matrix

vertex_len = int(input())
way_matrix = [[0 if x == y else float("inf") for y in range(vertex_len)] for x in range(vertex_len)]
for _ in range(int(input())):
    start, end, cost = list(map(int, input().split()))
    way_matrix[start - 1][end - 1] = min(cost, way_matrix[start - 1][end - 1])
result = floyd_warshall(way_matrix, vertex_len)
print("\n".join(map(lambda line: " ".join(map(lambda item: "0" if item == float("inf") else str(item), line)), result)))
