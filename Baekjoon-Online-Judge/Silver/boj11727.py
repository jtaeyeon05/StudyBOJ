n = int(input())
result = 1
for i in range(1, n // 2 + 1):
    now = 2 ** i
    for j in range(i):
        now *= n - i - j
        now //= j + 1
    result += now
print(result % 10007)
