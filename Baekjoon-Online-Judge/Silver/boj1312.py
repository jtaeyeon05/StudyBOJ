a, b, n = map(int, input().split())
print(a * int("1" + "0" * n) // b % 10)
