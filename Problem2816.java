/*
Problem 2816: Double a Number Represented as a Linked List

Approach: 
1. Reverse the linked list
2. Double each node's value while maintaining the carry 
3. If a carry remains after processing all nodes, add a new node
4. Reverse the linked list again to restore the original order

Time Complexity: O(n)
Space Complexity: O(1)
*/


class Solution {
    public ListNode doubleIt(ListNode head) {
        
        ListNode temp = head;
        ListNode back = null;
        while(temp!=null){
            ListNode front = temp.next;
            temp.next = back;
            back=temp;
            temp=front;
        }

        ListNode copy = back;
        temp = back;
        int carry = 0;
        back = null;
        while(temp!=null){
            int pr = (temp.val*2+carry);
            temp.val=pr%10;
            carry = pr/10;
            back = temp;
            temp=temp.next;  
        }
        if(carry>0){
             back.next = new ListNode(carry);
             back = back.next;
        }

        temp = copy;
        back = null;
        while(temp!=null){
            ListNode front = temp.next;
            temp.next = back;
            back=temp;
            temp=front;
        }

        return back;

        



    }
}
