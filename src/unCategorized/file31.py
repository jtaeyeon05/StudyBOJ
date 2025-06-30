k, n = map(int, input().split())
lan_list = [int(input()) for _ in range(k)]

start, end = 0, max(lan_list)
result = 0

while start <= end:
    mid = (start + end) // 2
    if mid == 0:
        result = 1
        break
    possible = sum(map(lambda x: x // mid, lan_list))
    if possible < n:
        end = mid - 1
    else:
        result = mid
        start = mid + 1

print(result)
