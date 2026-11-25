/*
Problem 148: Sort List

Approach:
1. Store the elements of the linked list in an ArrayList
2. Sort the ArrayList using Collections.sort()
3. Traverse the linked list and update its elements with the sorted values

Time Complexity: O(n log n)
Space Complexity: O(n)
*/

class Solution {
    public ListNode sortList(ListNode head) {
        ListNode temp = head;
        ArrayList<Integer> arr = new ArrayList<>();
        while(temp!=null){
            arr.add(temp.val);
            temp = temp.next;
        }
        Collections.sort(arr);
        temp = head;
        int i=0;
        while(temp!=null){
            temp.val = arr.get(i);
            temp=temp.next;
            i++;
        }
        return head;
    }
}
