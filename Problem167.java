/*
Problem 167: Two Sum II - Input Array is Sorted

Approach:
1. Initialize two pointers, i at the start and j at the end.
2. Calculate the sum of numbers[i] and numbers[j].
3. If the sum equals target, return their 1-based indices.
4. If the sum is smaller than target, increment i.
5. If the sum is greater than target, decrement j.

Time Complexity: O(n)
Space Complexity: O(1)
*/

class Solution {
    public int[] twoSum(int[] numbers, int target) {
        
        int i=0;
        int j=numbers.length-1;
        int[] ans = {-1,-1};
        while(i<j){
            int sum = numbers[i]+numbers[j];
            if(sum==target) {
                ans[0]=i+1;
                ans[1]=j+1;
                return ans;
            }else if(sum<target) i++;
            else j--;
        }

        return ans;

    }
}
