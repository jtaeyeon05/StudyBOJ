while True:
    data = list(map(int, input().split()))
    if data[0] == 0 and data[1] == 0:
        break
    if data[0] > data[1]:
        print("Yes")
    else:
        print("No")
