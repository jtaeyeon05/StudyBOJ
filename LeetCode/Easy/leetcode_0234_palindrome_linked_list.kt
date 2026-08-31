/**
 * Example:
 * var li = ListNode(5)
 * var v = li.`val`
 * Definition for singly-linked list.
 * class ListNode(var `val`: Int) {
 *     var next: ListNode? = null
 * }
 */

class Solution {
    fun isPalindrome(head: ListNode?): Boolean {
        var length = 0
        var list1 = head
        var list2: ListNode? = null

        while (list1 != null) {
            list2 = ListNode(list1!!.`val`).apply { next = list2 }
            list1 = list1.next
            length++
        }

        var head1 = head
        var head2 = list2
        for (i in 0 ..< length / 2) {
            if (head1?.`val` != head2?.`val`) return false
            head1 = head1?.next
            head2 = head2?.next
        }

        return true
    }
}
