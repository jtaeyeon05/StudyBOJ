import sys

card_list = [i + 1 for i in range(int(sys.stdin.readline()))]
first, length = 0, len(card_list)

while first + 1 < len(card_list):
    card_list.append(card_list[first + 1])
    first += 2

sys.stdout.write(str(card_list[-1]))