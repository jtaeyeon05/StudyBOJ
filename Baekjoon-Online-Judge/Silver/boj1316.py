import sys

result = 0

for i in range(int(sys.stdin.readline())):
    isGroupWord = True
    alphabets = []
    for char in sys.stdin.readline():
        if char not in alphabets:
            alphabets.append(char)
        elif alphabets.index(char) != len(alphabets) - 1:
            isGroupWord = False
            break
    if isGroupWord:
        result += 1

print(result)
