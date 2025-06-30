wordmap = "abcdefghijklmnopqrstuvwxyz"
_ = input()
word_list = list(input())
result = 0

for i in range(len(word_list)):
    result += (wordmap.index(word_list[i]) + 1) * 31 ** i

print(result % 1234567891)