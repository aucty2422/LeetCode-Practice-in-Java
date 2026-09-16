/*
Problem 41: First Missing Positive

Approach:
1. Sort the array 
2. Start with j = 1 as the smallest positive number to search for 
3. Skip all non-positive numbers and duplicate values 
4. If the current element equals j, increment j 
5. If the current element is greater than j, return j 
6. If all elements are processed, return j

Time Complexity: O(n * log n)
Space Complexity: O(1)
*/
class Solution {
    public int firstMissingPositive(int[] nums) {
        Arrays.sort(nums);
        int j=1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]<=0) continue;
            if(nums[i]==j){
                j++;
            }else if(nums[i]<j) continue;
            else return j;
        }
        return j;
    }
}
