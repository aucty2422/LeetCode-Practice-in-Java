/*
Problem 83: Remove Duplicates from Sorted List

Approach:
1. Traverse the sorted linked list using two pointers: temp and back.
2. Whenever temp points to a new unique value, link it after back and move back forward.
3. After traversal, set back.next to null to remove leftover duplicate references.

Time Complexity: O(n)
Space Complexity: O(1)
*/

class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        
        if(head==null|| head.next==null) return head;

        ListNode temp = head;
        ListNode back = head;
        while(temp!=null){
            if(temp.val!=back.val){
                back.next=temp;
                back=temp;
            }
            temp=temp.next;
            
        }
        back.next=null;
        return head;
    }
}
