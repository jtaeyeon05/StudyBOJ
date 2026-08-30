target, l = map(int, input().split())

for i in range(2, l):
    if target % i == 0:
        print("BAD", i)
        exit()

print("GOOD")
