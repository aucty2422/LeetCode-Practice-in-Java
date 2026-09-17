/*
Problem 23: Merge k Sorted Lists

Approach:
1. Traverse all the linked lists and store their values in an ArrayList
2. Sort the ArrayList using Collections.sort()
3. Create a new linked list using the sorted values
4. Use a dummy node to build the resulting linked list
5. Return the node after the dummy

Time Complexity: O(n * log n)
Space Complexity: O(n)
 */
class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        
        ArrayList<Integer> sorted = new ArrayList<>();
        for(int i=0;i<lists.length;i++){
            ListNode temp = lists[i];
            while(temp!=null){
                sorted.add(temp.val);
                temp=temp.next;
            }
        }
        Collections.sort(sorted);
        ListNode node = new ListNode(-1);
        ListNode dummy = node;
        for(int i=0;i<sorted.size();i++){
            ListNode newNode = new ListNode(sorted.get(i));
            dummy.next = newNode;
            dummy = dummy.next;
        }
        return node.next;


    }
}
