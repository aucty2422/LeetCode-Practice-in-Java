//2. Add Two Numbers



// Approach

// 1. Create a dummy node to build the answer sum linked list
// 2. Traverse both lists simultaneously
// 3. At each step, add the current digits and the carry
// 4. Create a new node with sum%10 and update carry as sum/10
// 5. If carry remains after traversal, create a new node and append it as last node


class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(-1);
        ListNode current = dummy;

        ListNode temp1 = l1;
        ListNode temp2 = l2;
        int carry = 0;
        while(temp1!=null || temp2!=null){
            int sum = carry;
            
            if(temp1!=null){
                sum+=temp1.val;
                temp1=temp1.next;
            }
            if(temp2!=null){
                sum+=temp2.val;
                temp2=temp2.next;
            }
            current.next = new ListNode(sum%10);
            current=current.next;
            carry = sum/10;

        }

        if(carry>0) {
            current.next = new ListNode(carry);
        }

       return dummy.next;
    }
}

//Time Complexity: O(max(m,n))
//Space Complexity: O(max(m,n))
