import sys

n, m = map(int, sys.stdin.readline().split())
gr = [set()] + [set() for i in range(n)]
se = set([i + 1 for i in range(n)])

for _ in range(m):
    a, b = map(int, sys.stdin.readline().split())
    gr[a].add(b)
    gr[b].add(a)


class Queue:
    def __init__(self, item1):
        self.__map = dict()
        self.__first = 0
        self.__last = 0
        self.__map[0] = item1

    def enqueue(self, item):
        self.__map[self.__last + 1] = item
        self.__last += 1

    def dequeue(self):
        tmp = self.__map[self.__first]
        del self.__map[self.__first]
        self.__first += 1
        return tmp

    def ok(self):
        return self.__last >= self.__first



result = 0

while len(se) > 0:
    result += 1

    queue = Queue(list(se)[0])
    visited = set()
    while queue.ok() > 0:
        now = queue.dequeue()

        if now in visited: continue
        visited.add(now)
        se.remove(now)

        for item in gr[now]:
            queue.enqueue(item)

print(result)
