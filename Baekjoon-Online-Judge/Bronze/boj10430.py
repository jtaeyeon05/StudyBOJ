values = input().split(" ")

a = int(values[0])
b = int(values[1])
c = int(values[2])

print((a + b) % c)
print(((a % c) + (b % c)) % c)
print((a * b) % c)
print(((a % c) * (b % c)) % c)
