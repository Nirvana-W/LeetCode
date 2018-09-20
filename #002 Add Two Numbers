# Definition for singly-linked list.
# class ListNode(object):
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution(object):
    def addTwoNumbers(self, l1, l2):
        """
        :type l1: ListNode
        :type l2: ListNode
        :rtype: ListNode
        """
        if not l1 or not l2: return l1 or l2
        carry = 0
        ans_tail = ans_head = ListNode(-1)
        
        while l1 is not None or l2 is not None:
            value1 = 0 if l1 is None else l1.val
            value2 = 0 if l2 is None else l2.val
            newNodeVal = value1 + value2 + carry
            carry = 1 if newNodeVal > 9 else 0
            ans_tail.next = ListNode(newNodeVal % 10)
            ans_tail = ans_tail.next
            l1 = None if l1 is None else l1.next
            l2 = None if l2 is None else l2.next
        ans_tail.next = ListNode(1) if carry > 0 else None
        return ans_head.next
        
