def lcs(x, y, z):
    len_x, len_y, len_z = len(x), len(y), len(z)
    matrix = [[[None for _ in range(len_z + 1)] for _ in range(len_y + 1)] for _ in range(len_x + 1)]
    for i in range(len_x + 1):
        for j in range(len_y + 1):
            for k in range(len_z + 1):
                if i == 0 or j == 0 or k == 0:
                    matrix[i][j][k] = 0
                elif x[i - 1] == y[j - 1] == z[k - 1]:
                    matrix[i][j][k] = 1 + matrix[i - 1][j - 1][k - 1]
                else:
                    matrix[i][j][k] = max(matrix[i - 1][j][k], matrix[i][j - 1][k], matrix[i][j][k - 1])
    return matrix[len_x][len_y][len_z]

print(lcs(input(), input(), input()))
