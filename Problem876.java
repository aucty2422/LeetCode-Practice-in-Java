/*
Problem 876: Middle of Linked List

Approach:
1.Use the Slow and Fast Pointer approach
2.Move the slow pointer one step at a time and the fast pointer two steps at a time
3.When the fast pointer reaches the end, the slow pointer will be at the middle of the linked list


Time Complexity: O(n)
Space Complexity: O(1)
*/
class Solution {
    public ListNode middleNode(ListNode head) {
        
        ListNode slow = head;
        ListNode fast = head;
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;

    }
}
