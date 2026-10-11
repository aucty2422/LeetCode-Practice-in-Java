/*
Problem 2778: Sum of Squares of Special Elements

Approach:
1. Take the length of the array as n
2. Traverse the array using a loop
3. Check if n is divisible by the current 1-based index (i+1)
4. If it is, add the square of the current element to sum
5. Return sum

Time Complexity: O(n)
Space Complexity: O(1)
*/
class Solution {
    public int sumOfSquares(int[] nums) {
        
        int n = nums.length;
        int sum=0;
        for(int i=0;i<nums.length;i++){
            if(n%(i+1)==0){
                sum=sum+nums[i]*nums[i];
            }
        }
        return sum;

    }
}
