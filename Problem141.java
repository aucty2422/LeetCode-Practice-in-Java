/*
Problem 141: Linked List Cycle

Approach:
1. Initialize two pointers, slow and fast, at the head
2. Move slow one step and fast two steps in each iteration
3. If slow and fast meet, a cycle exists
4. If fast or fast.next becomes null, the list has no cycle

Time Complexity: O(n)
Space Complexity: O(1)
*/

public class Solution {
    public boolean hasCycle(ListNode head) {
        
        ListNode slow = head;
        ListNode fast = head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast = fast.next.next;
            if(slow==fast) return true;
        }
        return false;
    }
}
