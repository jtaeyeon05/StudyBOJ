import sys

data = [0] * 10001
result = ""

for i in range(int(sys.stdin.readline())):
    data[int(sys.stdin.readline())] += 1

for i in range(len(data)):
    for ii in range(data[i]):
        sys.stdout.write(str(i) + "\n")

