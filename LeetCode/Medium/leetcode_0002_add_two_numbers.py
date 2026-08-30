# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next

class Solution:
    def addTwoNumbers(self, l1: Optional[ListNode], l2: Optional[ListNode]) -> Optional[ListNode]:
        result = None
        upper = 0
        while l1 or l2:
            num = upper
            if l1:
                num += l1.val
                l1 = l1.next
            if l2:
                num += l2.val
                l2 = l2.next
            result = ListNode(val = num % 10, next = result)
            upper = num // 10
        if upper != 0:
            result = ListNode(val = upper, next = result)

        prev = None
        curr = result
        while curr:
            next = curr.next
            curr.next = prev
            prev = curr
            curr = next
        
        return prev
