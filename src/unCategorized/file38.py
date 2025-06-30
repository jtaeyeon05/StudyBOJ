n = int(input())
man = list(sorted(map(int, input().split())))
print(sum(sum(man[:i + 1]) for i in range(n)))
