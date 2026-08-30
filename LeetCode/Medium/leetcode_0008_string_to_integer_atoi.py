class Solution:
    def myAtoi(self, s: str) -> int:
        # remove whitespaces
        while s and s[0] == " ":
            s = s[1:]
        
        # determine the signedness
        if s == "": 
            return 0
        sign = 1
        if s[0] == "+" or s[0] == "-":
            if s[0] == "-":
                sign = -1
            s = s[1:]

        # skip zeros
        if s == "": 
            return 0
        while s[0] == "0":
            if len(s) == 1:
                return 0
            s = s[1:]

        # read digits
        if s == "": 
            return 0
        num = 0
        while s and s[0] in "1234567890":
            num = 10 * num + int(s[0])
            s = s[1:]

        # round the result
        result = sign * num
        result = max(result, -(2 ** 31))
        result = min(result, 2 ** 31 - 1)

        return result
