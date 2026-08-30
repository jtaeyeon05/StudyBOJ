def lcs(x, y):
    len_x, len_y = len(x), len(y)
    matrix = [[None for _ in range(len_y + 1)] for _ in range(len_x + 1)]
    for i in range(len_x + 1):
        for j in range(len_y + 1):
            if i == 0 or j == 0:
                matrix[i][j] = 0
            elif x[i - 1] == y[j - 1]:
                matrix[i][j] = 1 + matrix[i - 1][j - 1]
            else:
                matrix[i][j] = max(matrix[i][j - 1], matrix[i - 1][j])
    return matrix[len_x][len_y]

str1, str2 = input(), input()
print(lcs(str1, str2))
