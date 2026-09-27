/*
Problem 92: Reverse Linked List II

Approach:
1. Find the left and right nodes between which reversal is needed
2. Store the node before left and the node after right to maintain the connections
3. Reverse the nodes from left to right and reconnect the reversed part with the remaining list

Time Complexity: O(n)
Space Complexity: O(1)
 */
class Solution {
    public ListNode reverseBetween(ListNode head, int left, int right) {

        if(head.next==null) return head;

        ListNode back = null;
        ListNode front = null;
        ListNode temp = head;
        ListNode start = null;
        ListNode end = null;
        int cnt = 0;
        while(temp!=null){
            cnt++;
            if(cnt==left-1){
                back = temp;
            }
            if(cnt==left){
                start = temp;
            }
            if(cnt==right){
                front = temp.next;
                end=temp;
            }
    
            temp=temp.next;
        }
        
        temp = start;
        ListNode back1 = null;
        while(temp!=front){
            ListNode front1 = temp.next;
            temp.next = back1;
            back1 = temp;
            temp=front1;
        }

        if (left == 1) {
            head = end;
        } else {
            back.next = end;
        }

        start.next = front;
        return head;



    }
}
