t = int(input())
a, b = 0, 0
while True:
    a += 1
    b += a
    if b > t:
        print(a - 1)
        break
