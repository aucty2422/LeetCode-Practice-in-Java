/*
 Problem 142: Linked List Cycle II
 
 Approach:
 1. Use slow and fast pointers
 2. Move slow by 1 step and fast by 2 steps
 3. If they meet, a cycle exists in the linked list
 4. Reset slow to head and move both slow and fast one step at a time
 5. The point where they meet again is the starting point of the cycle
 6. If slow and fast never meet, return null

 Time Complexity: O(n)
 Space Complexity: O(1)
 */

public class Solution {
    public ListNode detectCycle(ListNode head) {
        
        ListNode slow = head;
        ListNode fast = head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast = fast.next.next;
            
            if(slow==fast){
                slow=head;
                while(slow!=fast){
                    slow=slow.next;
                    fast = fast.next;
                }
                return slow;
            }
            
        }

        return null;
    }
}
