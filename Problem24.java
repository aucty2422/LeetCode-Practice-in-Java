/*
Problem 24: Swap Nodes in Pairs

Approach:
1. Take a dummy node and link it to head
2. Use a prev pointer referencing the dummy node
3. Loop while prev.next and prev.next.next are not null
4. Use two pointers to identify the pair of nodes
5. Swap the nodes and restore the links
6. Move prev to the second node of the swapped pair
7. Return dummy.next

Time Complexity: O(n)
Space Complexity: O(1)
*/
class Solution {
    public ListNode swapPairs(ListNode head) {
        
        if(head == null || head.next == null) return head;

        ListNode dummy = new ListNode(-1);
        dummy.next = head;

        ListNode prev = dummy;

        while(prev.next != null && prev.next.next != null){
            ListNode curr = prev.next;
            ListNode temp = prev.next.next;

            curr.next = temp.next;
            temp.next = curr;
            prev.next = temp;

            prev = curr;
        }

        return dummy.next;
    }
}
