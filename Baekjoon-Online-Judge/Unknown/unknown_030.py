n = int(input())
man_list = []
independent_man_list = []
result = [0] * n

for i in range(n):
    man = input().split()
    man_list.append((i, int(man[0]), int(man[1])))

for man in man_list:
    flag = True
    for man_comp in man_list:
        if man[0] != man_comp[0]:
            if man[1] >= man_comp[1] and man[2] <= man_comp[2]:
                flag = False
            elif man[1] <= man_comp[1] and man[2] >= man_comp[2]:
                flag = False
    if flag:
        independent_man_list.append(man)
independent_man_list.sort(key=lambda x: x[1], reverse=True)

i = 1
for independent_man in independent_man_list:
    flag = 0
    for man in man_list:
        if man[1] > independent_man[1] and result[man[0]] == 0:
            flag += 1
            result[man[0]] = i
    result[independent_man[0]] = i + flag
    i += flag + 1
for man in man_list:
    if result[man[0]] == 0:
        result[man[0]] = i

print(" ".join(map(str, result)))