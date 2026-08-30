import sys

data = []

for _ in range(int(sys.stdin.readline())):
    command = sys.stdin.readline()
    if command.startswith("push"):
        data.append(int(command.split(" ")[1]))
    elif command == "pop\n":
        if len(data) == 0:
            sys.stdout.write("-1\n")
        else:
            sys.stdout.write(str(data.pop()) + "\n")
    elif command == "size\n":
        sys.stdout.write(str(len(data)) + "\n")
    elif command == "empty\n":
        if len(data) == 0:
            sys.stdout.write("1\n")
        else:
            sys.stdout.write("0\n")
    elif command == "top\n":
        if len(data) == 0:
            sys.stdout.write("-1\n")
        else:
            sys.stdout.write(str(data[-1]) + "\n")
