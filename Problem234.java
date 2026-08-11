/*
Problem 234; Palindrome Linked List

Approach:
1. Find the middle of the linked list using slow and fast pointers
2. Reverse the second half of the linked list
3. Compare the first half and reversed second half using two pointers
4. If any values differ, return false; otherwise return true

Time Complexity: O(n)
Space Complexity: O(1)
*/

class Solution {
    public boolean isPalindrome(ListNode head) {
        
         //find middle
        ListNode slow = head;
        ListNode fast = head;
        while(fast.next!=null && fast.next.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        // reverse the nodes after middle
        ListNode temp = slow.next;
        ListNode back = null;
        while(temp!=null){
            ListNode front = temp.next;
            temp.next = back;
            back = temp;
            temp = front;
        }
        //two-pointer approach
        ListNode ptr1 = head;
        ListNode ptr2 = back;
        while(ptr2!=null){
            if(ptr1.val!=ptr2.val) return false;
            ptr1=ptr1.next;
            ptr2=ptr2.next;
        }
        return true;
        
        


    }
}
