/*
Problem 82: Remove Duplicates from Sorted List II

Approach:
1. Store the frequency of each value using a LinkedHashMap 
2. Traverse the map and add only the values whose frequency is 1 to a new linked list 
3. Return the new linked list

Time Complexity: O(n)
Space Complexity: O(n)

*/
class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        
        if(head==null || head.next==null) return head;

        LinkedHashMap<Integer,Integer> map = new LinkedHashMap<>();
        ListNode temp = head;
        while(temp!=null){
            map.put(temp.val,map.getOrDefault(temp.val,0)+1);
            temp=temp.next;
        }

        ListNode newHead = new ListNode(-1);
        ListNode curr = newHead;

        for(Map.Entry<Integer,Integer> entry: map.entrySet()){
            if(entry.getValue()==1){
                curr.next = new ListNode(entry.getKey());
                curr=curr.next;
            }
        }
        return newHead.next;


    }
}
