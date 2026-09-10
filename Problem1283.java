/*
Problem 1283: Find the Smallest Divisor Given a Threshold

Approach: 
1. The answer lies between 1 and the maximum element of the array 
2. Use binary search to find the smallest possible divisor 
3. For each mid, calculate the sum of ceil(nums[i] / mid) for all elements 
4. If the sum is less than or equal to the threshold, mid can be a possible answer, so search on the left side 
5. Otherwise, search on the right side 
6. Store the valid divisor in ans and continue searching for a smaller one

Time Complexity: O(n * log(max(nums)))
Space Complexity: O(1)
*/

class Solution {
    public int number(int[] nums, int mid){
        int cnt = 0;
        for(int i=0;i<nums.length;i++){
            cnt+=Math.ceil((double)nums[i]/mid);
        }
        return cnt;
    }
    public int smallestDivisor(int[] nums, int threshold) {

        int high = 0;
        for(int i=0;i<nums.length;i++){
            high = Math.max(high,nums[i]);
        }
        int low = 1;
        int ans = 0;
        while(low<=high){
            int mid = low + (high-low)/2;
            if(number(nums,mid)<=threshold){
                ans = mid;
                high = mid-1;
            }else low = mid+1;
        }

        return ans;
     

    }
}
