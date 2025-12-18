def knapsack(wt, val, w):
    m = len(wt)
    matrix = [[0 for _ in range(w + 1)] for _ in range(m + 1)]
    for i in range(1, m + 1):
        for w in range(w + 1):
            if wt[i - 1] > w:
                matrix[i][w] = matrix[i - 1][w]
            else:
                val_with = matrix[i - 1][w - wt[i - 1]] + val[i - 1]
                val_without = matrix[i - 1][w]
                matrix[i][w] = max(val_with, val_without)
    return matrix[m][w]

n, w = map(int, input().split())
wt, val = [], []
for _ in range(n):
    tmp1, tmp2 = map(int, input().split())
    wt.append(tmp1)
    val.append(tmp2)

print(knapsack(wt, val, w))
