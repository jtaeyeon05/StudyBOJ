n = int(input())
fibo = [0, 1]
for _ in range(n - 1):
    fibo.append(fibo[-1] + fibo[-2])
print(fibo[-1])
