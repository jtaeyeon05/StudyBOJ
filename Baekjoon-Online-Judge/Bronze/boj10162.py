from math import *

target = int(input())

isBreaking = False

for m5 in range(floor(target / 300), -1, -1):
    # breakPoint 0

    money5 = (target - 300 * m5)

    for m1 in range(floor(money5 / 60), -1, -1):
        # breakPoint 1

        money1 = money5 - 60 * m1

        if isBreaking:
            break

        if money1 % 10 == 0:
            print(m5, m1, money1 // 10)
            breakPoint = 0
            isBreaking = True

    if isBreaking:
        break

    if m5 == 0:
        print(-1)
