n, k = map(int, input().split())
a = set()
b = list()

for i in range(n):
    a.add(input())
for i in range(k):
    tmp = input()
    if tmp in a:
        b.append(tmp)

print(len(b))
print("\n".join(sorted(b)))
