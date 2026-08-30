n = int(input())
man_list = []
result = [0] * n

for i in range(n):
    man = input().split()
    man_list.append((i, int(man[0]), int(man[1])))

for man in man_list:
    i = 1
    for man_comp in man_list:
        if man[0] != man_comp[0]:
            if man[1] < man_comp[1] and man[2] < man_comp[2]:
                i += 1
    result[man[0]] = i

print(" ".join(map(str, result)))
