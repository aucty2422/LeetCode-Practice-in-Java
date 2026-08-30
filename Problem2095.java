/*
Problem 2095: Delete the Middle Node of a Linked List

Approach:
1.Use slow and fast pointers to find the middle node
2.Move slow one step and fast two steps at a time
3.Keep track of the node before slow using prev
4.When fast reaches the end, slow points to the middle node
5.Delete the middle node by updating prev.next to slow.next

Time Complexity: O(n)
Space Complexity: O(1)
*/

class Solution {
    public ListNode deleteMiddle(ListNode head) {
        if(head.next==null) return null;
        ListNode prev = null;
        ListNode slow = head;
        ListNode fast = head;
        while(fast!=null && fast.next!=null){
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        prev.next=slow.next;
        return head;
    }
}
