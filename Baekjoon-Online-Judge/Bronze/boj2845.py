party = list(map(int, input().split(" ")))

people = party[0] * party[1]

for news in map(int, input().split(" ")):
    print(news - people, end=" ")
