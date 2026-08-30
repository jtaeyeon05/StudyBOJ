x = int(input().split()[1])
result = []
for a in input().split():
    if int(a) < x:
        result.append(a)
print(" ".join(result))
