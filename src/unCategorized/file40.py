sq_list = [i * i for i in range(1, 225)]
target = int(input())

if target in sq_list:
    print(1)
else:
    start, end, mid = 0, 223, 0
    while not sq_list[mid] < target < sq_list[mid + 1]:
        mid = (start + end) // 2
        if sq_list[mid] > target:
            end = mid
        else:
            start = mid

    flag = False
    for i in range(mid + 1, 0, -1):
        for j in range(i, 0, -1):
            if i * i + j * j == target:
                print(2)
                flag = True
                break
        if flag:
            break

    if not flag:
        for i in range(mid + 1, 0, -1):
            for j in range(i, 0, -1):
                for k in range(j, 0, -1):
                    if i * i + j * j + k * k == target:
                        print(3)
                        flag = True
                        break
                if flag:
                    break
            if flag:
                break

    if not flag:
        print(4)
