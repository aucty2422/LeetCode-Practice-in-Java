/*
Problem 19: Remove Nth Node From End of List

Approach:
1. Move the fast pointer n nodes ahead of the slow pointer.
2. If fast becomes null, the head node is the one to remove.
3. Otherwise, move both pointers together until fast reaches the end.
4. Remove the target node by updating prev.next.

Time Complexity: O(n)
Space Complexity: O(1)
*/
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {


        ListNode fast = head;
        for(int i=0;i<n;i++){
            fast = fast.next;
        }
        if(fast==null) return head.next;
        ListNode slow = head;
        ListNode prev = null;
        while(fast!=null){
            prev = slow;
            slow=slow.next;
            fast = fast.next;
        }
        prev.next=slow.next;
        return head;


    }
}
