/*
Problem 162: Find Peak Element

Approach:
1. Handle the single element case 
2. Check if the first or last element is a peak 
3. Apply binary search on the remaining elements 
4. If nums[mid] is greater than both neighbours, return mid 
5. If the left neighbour is greater, search in the left half 
6. Otherwise search in the right half

Time Complexity: O(log n)
Space Complexity: O(1)
*/

class Solution {
    public int findPeakElement(int[] nums) {
        
        if(nums.length==1) return 0;

        int low = 0;
        int high = nums.length-1;
        if(nums[low]>nums[low+1]) return low;
        if(nums[high]>nums[high-1]) return high;

        low = 1;
        high = high-1;

        while(low<=high){
            int mid = low + (high-low)/2;
            if(nums[mid]>nums[mid-1] && nums[mid]>nums[mid+1]) return mid;
            else if(nums[mid]<nums[mid-1]) high = mid-1;
            else low = mid+1;
        }
        return -1;


    }
}
