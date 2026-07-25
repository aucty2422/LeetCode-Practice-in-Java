/*
Problem 33: Search in Rotated Sorted Array 

Approach: (Binary Search)
1. Perform binary search.
2. If nums[mid] == target, return its index.
3. Determine which half is sorted:
   - If the left half is sorted, check whether the target lies in it.
   - Otherwise, the right half is sorted; check whether the target lies there.
4. Continue searching in the appropriate half.
5. If the target is not found, return -1.

Time Complexity: O(log n)
Space Complexity: O(1)
*/

class Solution {
    public int search(int[] nums, int target) {
        int low = 0;
        int high = nums.length -1;
        while(low<=high){
            int mid = low + (high-low)/2;
            if(nums[mid]==target) return mid;
            if(nums[low]<=nums[mid]){
                if(nums[low]<=target && target<=nums[mid]){
                    high = mid-1;
                }else{
                    low = mid+1;
                }
            }else{
                if(nums[mid]<target && target<=nums[high]){
                    low = mid+1;
                }else {
                    high = mid -1;
                }
            }
        }
        return -1;
    }
}
