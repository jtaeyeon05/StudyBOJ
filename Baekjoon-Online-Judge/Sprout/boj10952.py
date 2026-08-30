while True:
    value = input()
    if value == "0 0":
        break
    print(int(value.split()[0]) + int(value.split()[1]))
