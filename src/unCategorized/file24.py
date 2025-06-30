n, m = map(int, input().split())
card_list = list(map(int, input().split()))
result = 0
for i in range(n - 2):
    for j in range(i + 1, n - 1):
        for k in range(j + 1, n):
            select = card_list[i] + card_list[j] + card_list[k]
            if result < select <= m:
                result = select
print(result)