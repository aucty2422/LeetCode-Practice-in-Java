/*
Problem 35: Search Insert Position

Approach: (Binary Search)
1. Find the first index where nums[index]>=target
2. If the target exists, return it's index
3. Otherwise, return the index where it should be inserted

Time Complexity: O(log n)
Space Complexity: O(1)
*/

class Solution {
    public int searchInsert(int[] nums, int target) {
        int low = 0;
        int high = nums.length-1;
        int position = nums.length;
        while(low<=high){
            int mid = low + (high-low)/2;
            if(nums[mid]>=target){
                position = mid;
                high = mid-1;
            }else low = mid+1;
        }
        return position;
    }
}
