/*
Problem 237: Delete Node in a Linked List

Approach:
1. Copy the value of the next node into the current node
2. Skip the next node by linking current node to node.next.next

Time Complexity: O(1)
Space Complexity: O(1)
*/
class Solution {
    public void deleteNode(ListNode node) {
        node.val = node.next.val;
        node.next=node.next.next;
    }
}
