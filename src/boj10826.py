n = int(input())
fibo = [0, 1]
for _ in range(n - 1):
    fibo.append(fibo[-1] + fibo[-2])
if n == 0:
    print(0)
else:
    print(fibo[-1])
