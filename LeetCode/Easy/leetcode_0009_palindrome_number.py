class Solution:
    def isPalindrome(self, x: int) -> bool:
        if x < 0:
            return False
        
        digits = 1
        while x // 10 ** digits != 0:
            digits += 1
        
        n1, n2 = 1, 10 ** (digits - 1)
        for i in range(digits // 2):
            if x // n1 % 10 != x // n2 % 10:
                return False
            n1 *= 10
            n2 //= 10
        return True
        