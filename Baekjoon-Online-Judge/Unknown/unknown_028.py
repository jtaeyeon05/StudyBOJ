n = int(input())
target = [int(input()) for _ in range(n)]
numbers = [n - i for i in range(n)]
stack = []
result = []

for i in range(n):
    while numbers and target[i] >= numbers[-1]:
        stack.append(numbers.pop())
        result.append("+")
    while stack and target[i] == stack[-1]:
        stack.pop()
        result.append("-")

if len(stack) == 0 and len(numbers) == 0:
    print("\n".join(result))
else:
    print("NO")
