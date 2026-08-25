/*
Problem 160: Intersection of Two Linked Lists

Approach:
1. Calculate the lengths of both linked lists
2. Find the difference between their lengths
3. Move the pointer of the longer list forward by the difference
4. Traverse both lists together until both pointers meet
5. If the pointers refer to the same node, return that node
6. If no intersection exists, return null

Time Complexity: O(m+n)
Space Complexity: O(1)
*/

public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int lenA=0;
        int lenB=0;
        ListNode tempA = headA;
        ListNode tempB = headB;
        while(tempA!=null){
            lenA++;
            tempA=tempA.next;
        }
        while(tempB!=null){
            lenB++;
            tempB=tempB.next;
        }

        int diff = Math.abs(lenA-lenB);
        tempA = headA;
        tempB = headB;
        if(lenA>=lenB){
            for(int i=0;i<diff;i++){
                tempA=tempA.next;
            }
        }else{
            for(int i=0;i<diff;i++){
                tempB=tempB.next;
            }
        }

        while(tempA!=null){
            if(tempA==tempB) return tempA;
            tempA=tempA.next;
            tempB=tempB.next;
        }
        return null;
    }
}
