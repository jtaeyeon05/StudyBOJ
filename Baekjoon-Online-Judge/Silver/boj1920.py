def check(target: list, number: int):
    start = 0
    end = len(target) - 1
    while start <= end:
        mid = (start + end) // 2
        if target[mid] == number:
            return 1
        elif target[mid] > number:
            end = mid - 1
        else:
            start = mid + 1
    return 0


input()
a = sorted(map(int, input().split()))
input()

for s in input().split():
    print(check(a, int(s)))
