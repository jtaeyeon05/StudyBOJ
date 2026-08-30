import sys

for i in range(int(sys.stdin.readline())):
    isVps = True
    parenthesis = []

    for char in sys.stdin.readline():
        if char == '(':
            parenthesis.append('(')
        elif char == ')':
            if len(parenthesis) == 0:
                isVps = False
                break
            elif parenthesis[-1] == '(':
                del parenthesis[-1]
    if len(parenthesis) != 0:
        isVps = False

    print("YES" if isVps else "NO")
