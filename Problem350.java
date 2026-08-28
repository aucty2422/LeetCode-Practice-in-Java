/*
Problem 350: Intersection of Two Arrays II

Approach:
1. Sort both the given arrays
2. Use two pointers to find the intersection of both arrays
3. Store the common elements in an ArrayList
4. Copy the ArrayList elements into a newly created array and return it

Time Complexity: O(m log m + n log n)
Space Complexity: O(m + n)
*/

class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        ArrayList<Integer> ans = new ArrayList<>();
        int i=0;
        int j=0;
        while(i<nums1.length && j<nums2.length){
            if(nums1[i]<nums2[j]) i++;
            else if(nums1[i]>nums2[j]) j++;
            else{
                ans.add(nums1[i]);
                i++;
                j++;
            }
        }

        int[] answer = new int[ans.size()];
        i=0;
        for(int ele: ans){
            answer[i]=ele;
            i++;
        }
        return answer;

    }
}
