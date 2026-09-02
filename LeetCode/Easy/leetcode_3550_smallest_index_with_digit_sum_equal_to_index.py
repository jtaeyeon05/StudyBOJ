class Solution:
    def smallestIndex(self, nums: List[int]) -> int:
        def sumOfDigits(x: int) -> int:
            output = 0
            while x != 0:
                output += x % 10
                x //= 10
            return output
        nums = list(map(sumOfDigits, nums))
        for i in range(len(nums)):
            if i == nums[i]:
                return i
        return -1
