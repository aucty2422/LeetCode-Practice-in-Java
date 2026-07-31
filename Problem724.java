/*
Problem 724: Find Pivot Index

Approach:
1. Calculate the total sum of all array elements.
2. Initialize leftSum = 0.
3. Traverse the array:
   - Subtract the current element from totalSum. Now, totalSum represents the sum of elements on the right.
   - If leftSum == totalSum, the current index is the pivot index.
   - Otherwise, add the current element to leftSum and continue.
4. If no pivot index is found, return -1.

Time Complexity: O(n)
Space Complexity: O(1)
*/

class Solution {
    public int pivotIndex(int[] nums) {
        
        int totalSum = 0;
        for(int i=0;i<nums.length;i++){
            totalSum+=nums[i];
        }

        int sumLeft = 0;
        for(int i=0;i<nums.length;i++){
            totalSum-=nums[i];
            if(totalSum==sumLeft) return i;
            sumLeft+=nums[i];
        }
        return -1;
    }
}
