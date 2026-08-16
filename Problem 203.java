/*
 Problem 203: Remove Linked List Elements

 Approach:
 1. First handle the nodes from the beginning whose value is equal to val and update the head
 2. Use two pointers, prev and temp, to keep track of the previous and current node
 3. If the current node's value is equal to val, connect the previous node to the next node
 4. Return the updated head of the linked list

 Time Complexity: O(n)
 Space Complexity: O(1)
*/
class Solution {
    public ListNode removeElements(ListNode head, int val) {
        
        if(head==null) return null;
        while(head.val==val){
            if(head.next==null) return null;
            head=head.next;
        }
        ListNode temp = head;
        ListNode prev = null;
        while(temp.next!=null){
            if(prev!=null && temp.val==val){
                prev.next=temp.next;
            }
            else prev = temp;
            temp=temp.next;
        }
        if(temp.val==val) prev.next=temp.next;
        return head;

    }
}
