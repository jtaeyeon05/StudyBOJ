for _ in range(int(input())):
    target = int(input())

    found = 0
    queue = [0]
    while queue:
        now = queue.pop(0)

        if now == target:
            found += 1

        if now + 1 <= target:
            queue.append(now + 1)
        if now + 2 <= target:
            queue.append(now + 2)
        if now + 3 <= target:
            queue.append(now + 3)

    print(found)
