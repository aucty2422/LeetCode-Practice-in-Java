/*
Problem 2656: Maximum Sum With Exactly K Elements

Approach:
1. Find the maximum element in the array in maxi
2. Store the maximum element in a separate variable
3. For the remaining k-1 operations, increment the value by 1
4. Add the updated value to maxi in every iteration
5. Return maxi as the maximum sum

Time Complexity: O(n + k)
Space Complexity: O(1)
*/

class Solution {

    public int maximizeSum(int[] nums, int k) {

        int maxi = Integer.MIN_VALUE;

        for(int i=0;i<nums.length;i++){
            maxi=Math.max(maxi,nums[i]);
        }

        int val=maxi;

        while(k-->1){
            val+=1;
            maxi+=val;
        }

        return maxi;
    }
}
