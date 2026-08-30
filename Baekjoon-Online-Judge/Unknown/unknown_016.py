a, b = map(int, input().split())
people, result = [i + 1 for i in range(a)], []
now = -1

while any(people):
    i = 0
    while i < b:
        if now == len(people) - 1:
            now = 0
        else:
            now += 1
        if people[now] != 0:
            i += 1
    result.append(people[now])
    people[now] = 0

print("<" + ", ".join(map(str, result)) + ">")
