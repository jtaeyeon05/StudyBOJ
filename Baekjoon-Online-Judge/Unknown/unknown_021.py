class Queue:
    def __init__(self):
        self.queue = dict()
        self.first = 0
        self.last = -1

    def enqueue(self, value):
        self.last += 1
        self.queue[self.last] = value

    def dequeue(self):
        self.first += 1
        tmp = self.queue[self.first - 1]
        del self.queue[self.first - 1]
        return tmp

    def peek(self):
        return max(map(lambda x: x[0], self.queue.values())) if not self.empty() else 0

    def empty(self):
        return self.first > self.last


for _ in range(int(input())):
    size, target = map(int, input().split())
    card_list = list(map(int, input().split()))
    card_queue = Queue()
    result = 0
    for i in range(size):
        card_queue.enqueue((card_list[i], i == target))

    while True:
        item = card_queue.dequeue()
        if item[0] >= card_queue.peek():
            if item[1]:
                print(result + 1)
                break
            else:
                result += 1
        else:
            card_queue.enqueue(item)
