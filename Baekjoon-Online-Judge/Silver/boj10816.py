m = input()
cardList = sorted(map(int, input().split()))
cards = {}

n = int(input())
resultList = list(map(int, input().split()))

for number in cardList:
    if number not in cards:
        cards[number] = 1
    else:
        cards[number] += 1

for number in resultList:
    start = 0
    end = n - 1
    mid = (start + end) // 2

    while start <= end:
        mid = (start + end) // 2
        if cardList[mid] == number:
            break
        elif cardList[mid] > number:
            end = mid - 1
        else:
            start = mid + 1

    print(cards[number] if cardList[mid] == number else "0", end=" ")
