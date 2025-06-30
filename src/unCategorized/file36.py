import re

eva = [re.sub("^0+", "", re.sub(r"-0+", "-", re.sub(r"\+0+", "+", input())))]
length = len(eva[0].split("+")) + len(eva[0].split("-")) - 1

def make_90(command):
    start_list, end_list = [0], []
    for i in range(len(command)):
        if command[i] == "+" or command[i] == "-":
            start_list.append(i + 1)
            end_list.append(i)
    end_list.append(len(command))

    result = []
    for start in start_list:
        for end in end_list:
            if start < end:
                result.append(command[:start] + "(" + command[start:end] + ")" + command[end:])
    return result

last_len = 0
for i in range(length):
    tmp = last_len
    last_len = len(eva)
    for j in range(tmp, len(eva)):
        eva += make_90(eva[j])

result = min(map(eval, eva))
print(result)
