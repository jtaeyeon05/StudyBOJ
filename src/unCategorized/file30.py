n = int(input())
result = 0
while True:
    result += 1
    if result + sum([result // (10 ** i) % 10 for i in range(len(str(result)))]) == n:
        print(result)
        break
    if result >= n:
        print(0)
        break