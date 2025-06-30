import sys
for i in range(int(sys.stdin.readline())):
    sys.stdout.write(str(sum(map(int, sys.stdin.readline().split(" ")))) + "\n")