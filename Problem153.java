/*
Problem 153: Find Minimum in Rotated Sorted Array

Approach:
1. Apply Binary Search and check whether the current search space is already sorted.
2. If the search space is sorted, update the answer with nums[low] and stop.
3. If the left half is sorted, update the answer with nums[low] and search in the right half.
4. Otherwise, update the answer with nums[mid] and search in the left half.

Time Complexity: O(log n)
Space Complexity: O(1)
*/

class Solution {
    public int findMin(int[] nums) {
        
        int low = 0;
        int high = nums.length-1;
        int ans = Integer.MAX_VALUE;
        while(low<=high){
            int mid = low + (high-low)/2;
            if(nums[low]<=nums[high]){
                ans = Math.min(ans,nums[low]);
                break;
            }
            if(nums[low]<=nums[mid]){
                ans=Math.min(nums[low],ans);
                low=mid+1;
            }else{
                ans=Math.min(nums[mid],ans);
                high = mid -1;
            }
            


        }

        return ans;

    }
}
