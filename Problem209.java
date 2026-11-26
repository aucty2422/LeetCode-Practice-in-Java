/*
Problem 209. Minimum Size Subarray Sum

Approach:
1. Calculate the total sum to return 0 if no valid subarray exists
2. Use two pointers to maintain a sliding window and calculate its sum
3. Expand the window by moving the right pointer until the sum reaches the target
4. Shrink the window from the left while the sum remains greater than or equal to the target, updating the minimum length
5. Return the minimum length found

Time Complexity: O(n)
Space Complexity: O(1)
*/
class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int sum = 0;
        int i=0;
        int j=0;
        int maxSum=0;
        for(int k=0;k<nums.length;k++) maxSum+=nums[k];
        if(maxSum<target) return 0;
        int minLen = nums.length;
        while(j<nums.length){
            sum+=nums[j];
            while(sum>=target){
                minLen=Math.min(minLen,j-i+1);
                sum-=nums[i];
                i++;
            }
            j++;
        }
        return minLen;
    }
}
