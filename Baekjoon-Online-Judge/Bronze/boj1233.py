arr = [0 for i in range(81)]
s1, s2, s3 = map(int, input().split())

for i1 in range(1, s1 + 1):
    for i2 in range(1, s2 + 1):
        for i3 in range(1, s3 + 1):
            arr[i1 + i2 + i3] += 1

print(arr.index(max(arr)))
