import sys
a = int(input())
for i in range(a, 0, -1):
    for ii in range(i):
        sys.stdout.write("*")
    sys.stdout.write("\n")
