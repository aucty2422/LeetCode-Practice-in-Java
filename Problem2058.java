/*
Problem 2058: Find the Minimum and Maximum Number of Nodes Between Critical Points

Appraoch:
1. Traverse the linked list while keeping track of the previous, current, and next nodes
2. Check whether the current node is a critical point by comparing it with its previous and next nodes
3. Store the positions of all critical points in an ArrayList
4. The maximum distance is the difference between the first and last critical points
5. Find the minimum distance by checking the difference between every pair of consecutive critical points

Time Complexity: O(n)
Space Complexity: O(n)
*/

class Solution {
    public int[] nodesBetweenCriticalPoints(ListNode head) {

        if (head.next.next == null) return new int[] { -1, - 1 };
        
        ArrayList<Integer> local = new ArrayList<>();
        int len = 0;
        ListNode back = null;
        ListNode temp = head;
        while (temp != null) {
            ListNode front = temp.next;
            len++;
            if (front!=null && back!=null && back.val<temp.val && temp.val>front.val) 
              local.add(len);
            else if (front!=null && back!=null && back.val>temp.val && temp.val<front.val) 
              local.add(len);
            back = temp;
            temp = temp.next;
        }

        if (local.isEmpty() || local.size() == 1) return new int[] {-1,-1};
      
        int maxi = local.get(local.size()-1) - local.get(0);
        int mini = Integer.MAX_VALUE;

        for (int i = 1; i < local.size(); i++) {
            mini=Math.min(mini,local.get(i) - local.get(i-1));
        }
        return new int[] {mini,maxi};

    }
}
