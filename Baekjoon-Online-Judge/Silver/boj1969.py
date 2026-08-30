size, length = map(int, input().split())
dna_list = [input() for i in range(size)]

result = ""
distance = 0

for index in range(length):
    lowValue, lowDistance = '', -1
    for base in ['A', 'C', 'G', 'T']:
        calcDistance = 0
        for dna in dna_list:
            if dna[index] != base:
                calcDistance += 1
        if lowDistance == -1 or calcDistance < lowDistance:
            lowValue = base
            lowDistance = calcDistance
    result += lowValue
    distance += lowDistance

print(result)
print(distance)
