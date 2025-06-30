num1, num2 = map(int, input().split())
num1_d, num2_d = {}, {}
result1, result2 = 1, 1

for i in range(2, 10_000):
    while num1 % i == 0:
        num1 /= i
        if i in num1_d:
            num1_d[i] += 1
        else:
            num1_d[i] = 1
    while num2 % i == 0:
        num2 /= i
        if i in num2_d:
            num2_d[i] += 1
        else:
            num2_d[i] = 1

keys = set(list(num1_d.keys()) + list(num2_d.keys()))
for key in keys:
    result1 *= key ** min(num1_d.get(key, 0), num2_d.get(key, 0))
    result2 *= key ** max(num1_d.get(key, 0), num2_d.get(key, 0))

print(result1)
print(result2)
