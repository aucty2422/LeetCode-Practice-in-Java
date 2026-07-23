/*
Problem 1822: Sign of the Product of an Array

Approach:
1. Traverse the array
2. If element is zero,then return 0 
3. Store the count of negative elements
4. If odd number of negative elements, return -1
5. Else return 1 

Time Complexity: O(n)
Space Complexity: O(1)
*/

class Solution {
    public int arraySign(int[] nums) {
        
        int neg=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0) return 0;
            if(nums[i]<0) neg++;
        }

        if(neg%2!=0) return -1;
        return 1;
    }
}
