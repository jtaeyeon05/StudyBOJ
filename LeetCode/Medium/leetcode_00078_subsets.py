class Solution:
    def subsets(self, nums: List[int]) -> List[List[int]]:
        output = []
        for i in range(2 ** len(nums)):
            item = []
            for j in range(len(nums)):
                if i & 2 ** j:
                    item.append(nums[j])
            output.append(item)
        return output
