n, k = map(int, input().split())
matrix = [[0 for _ in range(k + 1)] for _ in range(n + 1)]
for i in range(n + 1):
    for j in range(k + 1):
        if j == 0 or j == i:
            matrix[i][j] = 1
        else:
            matrix[i][j] = matrix[i - 1][j - 1] + matrix[i - 1][j]
print(matrix[n][k] % 10_007)
