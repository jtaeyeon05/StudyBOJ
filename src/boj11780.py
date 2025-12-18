def kkiyatho(matrix, length):
    result_matrix = [[(matrix[x][y], []) for y in range(length)] for x in range(length)]
    for k in range(length):
        for i in range(length):
            for j in range(length):
                if result_matrix[i][k][0] + result_matrix[k][j][0] < result_matrix[i][j][0]:
                    result_matrix[i][j] = result_matrix[i][k][0] + result_matrix[k][j][0], result_matrix[i][k][1] + [k] + result_matrix[k][j][1]
    return result_matrix

vertex_len = int(input())
way_matrix = [[0 if x == y else float("inf") for y in range(vertex_len)] for x in range(vertex_len)]
for _ in range(int(input())):
    start, end, cost = list(map(int, input().split()))
    way_matrix[start - 1][end - 1] = min(cost, way_matrix[start - 1][end - 1])

result = kkiyatho(way_matrix, vertex_len)
print("\n".join(map(lambda line: " ".join(map(lambda item: "0" if item[0] == float("inf") else str(item[0]), line)), result)))
for i in range(vertex_len):
    for j in range(vertex_len):
        if i == j or result[i][j][0] == float("inf"):
            print("0")
        else:
            way = [i] + result[i][j][1] + [j]
            print(f"{len(way)} {" ".join(map(lambda item: str(item + 1), way))}")
