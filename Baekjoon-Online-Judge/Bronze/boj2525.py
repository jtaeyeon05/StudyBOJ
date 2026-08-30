import math

time = input().split(" ")

hour = int(time[0])
minute = int(time[1])
timer = int(input())

add = math.floor((minute + timer) / 60)

print(
    hour + add - 24 if hour + add >= 24 else hour + add,
    minute + timer - add * 60
)
