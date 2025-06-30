import re

command = input()
command = re.sub(r"^0+", "", command)
command = re.sub(r"-0+", "-", command)
command = re.sub(r"\+0+", "+", command)

print(eval("(" + ")-(".join(command.split("-")) + ")"))
