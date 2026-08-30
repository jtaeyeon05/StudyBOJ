import math

info = list(map(int, input().split()))
print(math.ceil((info[2] - info[0]) / (info[0] - info[1])) + 1)
