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
                matrix[i][j] = max(matrix[i - 1][j], matrix[i][j - 1])
    return matrix[len_x][len_y]

input()
list1 = list(map(int, input().split()))
list2 = list(map(int, input().split()))
print(lcs(list1, list2))
