n = int(input())
matrix = [1, 1]
for _ in range(n - 2):
    matrix.append(matrix[-1] + matrix[-2])
print(f"{matrix[-1]} {n - 2}")
