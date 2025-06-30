s1, s2, s3 = input(), input(), input()

if s1 != "Fizz" and s1 != "Buzz" and s1 != "FizzBuzz":
    target = int(s1) + 3
    if target % 3 == 0 and target % 5 == 0:
        print("FizzBuzz")
    elif target % 3 == 0:
        print("Fizz")
    elif target % 5 == 0:
        print("Buzz")
    else:
        print(target)

elif s2 != "Fizz" and s2 != "Buzz" and s2 != "FizzBuzz":
    target = int(s2) + 2
    if target % 3 == 0 and target % 5 == 0:
        print("FizzBuzz")
    elif target % 3 == 0:
        print("Fizz")
    elif target % 5 == 0:
        print("Buzz")
    else:
        print(target)

elif s3 != "Fizz" and s3 != "Buzz" and s3 != "FizzBuzz":
    target = int(s3) + 1
    if target % 3 == 0 and target % 5 == 0:
        print("FizzBuzz")
    elif target % 3 == 0:
        print("Fizz")
    elif target % 5 == 0:
        print("Buzz")
    else:
        print(target)
