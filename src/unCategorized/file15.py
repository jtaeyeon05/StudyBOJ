import sys

def println(msg):
    sys.stdout.write(str(msg) + "\n")

first, last = 0, -1
data = {}

for i in range(int(input())):
    command = sys.stdin.readline()
    if command.startswith("push"):
        last += 1
        data[last] = int(command.split(" ")[1])
    elif command == "pop\n":
        if first > last:
            println(-1)
        else:
            temp = data[first]
            del data[first]
            first += 1
            println(temp)
    elif command == "size\n":
        println(last - first + 1)
    elif command == "empty\n":
        println(1 if last - first + 1 == 0 else 0)
    elif command == "front\n":
        if first > last:
            println(-1)
        else:
            println(data[first])
    elif command == "back\n":
        if first > last:
            println(-1)
        else:
            println(data[last])
