/*
Problem 328: Odd Even Linked List

Approach:
1. Use odd and even pointers to build separate odd and even sequences.
2. Link odd to the next odd node and even to the next even node.
3. Continue until no more pairs can be processed.
4. Link the odd sequence to the beginning of the even sequence.

Time Complexity: O(n)
Space Complexity: O(1)

*/
class Solution {
    public ListNode oddEvenList(ListNode head) {
        
        if(head==null || head.next==null || head.next.next==null) return head;

        ListNode even = head.next;
        ListNode odd = head;
        ListNode evenHead = even;
        while(even!=null && even.next!=null){
            odd.next=even.next;
            odd=odd.next;

            even.next = odd.next;
            even=even.next;
        }
        odd.next = evenHead;
        return head;
    }
}
