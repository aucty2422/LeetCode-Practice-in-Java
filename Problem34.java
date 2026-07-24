/*
Problem 34: Find First and Last Position of Element in Sorted Array

Approach: (Binary Search)
1. Perform a binary search to find the first occurrence of the target.
   - If target is found, store the index and continue searching in the left half.
2. Perform another binary search to find the last occurrence of the target.
   - If target is found, store the index and continue searching in the right half.
3. Return the indices of the first and last occurrences.
   - If the target is not present, both indices remain -1.

Time Complexity: O(log n)
Space Complexity: O(1)
*/


class Solution {
    public int[] searchRange(int[] nums, int target) {
        
        int low = 0;
        int high = nums.length-1;

        //first occurence
        int first = -1;
        while(low<=high){
            int mid = low + (high-low)/2;
            if(nums[mid]==target){
                first = mid;
                high = mid-1;
            }
            else if(nums[mid]>target){
                high = mid - 1;
            }else{
                low = mid+1;
            }
        }
        
        low = 0;
        high = nums.length-1;

        //last occurence
        int last = -1;
        while(low<=high){
            int mid = low + (high-low)/2;
            if(nums[mid]==target){
                last = mid;
                low = mid+1;
            }
            else if(nums[mid]>target){
                high = mid - 1;
            }else{
                low = mid+1;
            }
        }

        int[] ans = new int[2];
        ans[0] = first;
        ans[1] = last;
        return ans;
    }
}
