from math import ceil

num = int(input())
t_shirts = map(int, input().split())
t, p = map(int, input().split())

t_ss = 0
for t_s in t_shirts:
    t_ss += ceil(t_s / t)

print(t_ss)
print(num // p, num % p)
