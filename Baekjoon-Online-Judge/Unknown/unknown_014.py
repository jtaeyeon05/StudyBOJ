import sys

arr = []
for _ in range(int(sys.stdin.readline())):
    arr.append(int(sys.stdin.readline()))
sys.stdout.write("\n".join(map(str, sorted(arr))))