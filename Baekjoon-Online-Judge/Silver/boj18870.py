n = int(input())
x = list(map(int, input().split()))
xs = sorted(set(x))

def find(li, target, left, right):
    if left > right:
        return -1
    mid = (left + right) // 2
    if li[mid] == target:
        return mid
    elif li[mid] > target:
        return find(li, target, left, mid - 1)
    else:
        return find(li, target, mid + 1, right)

for i in range(n):
    print(find(xs, x[i], 0, len(xs) - 1), end = " ")
