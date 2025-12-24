def euclid(n1, n2):
    if n2 == 0:
        return n1
    n1, n2 = n2, n1 - (n1 // n2) * n2
    return euclid(n1, n2)

for _ in range(int(input())):
    a, b = sorted(map(int, input().split()))
    n = euclid(a, b)
    print(a * b // n)
