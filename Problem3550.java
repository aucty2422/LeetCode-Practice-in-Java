/*
Problem 3550: Smallest Index With Digit Sum Equal to Index

Approach:
1. Traverse through the array and calculate the digit sum of each element
2. Compare the digit sum with the current index
3. Return the first index where both are equal
4. If no such index exists, return -1

Time Complexity:  O(n * log n)
Space Complexity: O(1)
*/

class Solution {
    public int sum(int n){
        int total = 0;
        while(n>0){
            total+=n%10;
            n=n/10;
        }
        return total;
    }
    public int smallestIndex(int[] nums) {
        for(int i=0;i<nums.length;i++){
            if(sum(nums[i])==i) return i;
        }
        return -1;
    }
}
