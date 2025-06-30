import sys

my_set = set()
for _ in range(int(sys.stdin.readline())):
    command = sys.stdin.readline().split()

    if command[0] == "add":
        my_set.add(int(command[1]))
    elif command[0] == "remove":
        if int(command[1]) in my_set:
            my_set.remove(int(command[1]))
    elif command[0] == "check":
        if int(command[1]) in my_set:
            print(1)
        else:
            print(0)
    elif command[0] == "toggle":
        if int(command[1]) in my_set:
            my_set.remove(int(command[1]))
        else:
            my_set.add(int(command[1]))
    elif command[0] == "all":
        my_set = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20}
    elif command[0] == "empty":
        my_set = set()