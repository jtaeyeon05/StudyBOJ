input()
sos = 0
for number in input().split():
    soo = True
    n = int(number)
    for i in range(2, n - 1):
        if n % i == 0:
            soo = False
    if soo and n != 1:
        sos += 1
print(sos)
