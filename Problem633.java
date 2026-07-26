/*
Problem 633: Sum of Square Numbers

Approach: (Two Pointers)
1. Initialize low to 0 and high to √c.
2. If low² + high² == c, return true.
3. If the sum is less than c, increment low.
4. Otherwise, decrement high.
5. If no such pair exists, return false.

Time Complexity: O(√c)
Space Complexity: O(1)
*/

class Solution {
    public boolean judgeSquareSum(int c) {
       
       int low = 0;
       int high = (int)Math.sqrt(c);
       while(low<=high){
            long val = (long) low*low + (long) high*high;
            if(val==c) return true;
            else if(val<c) low++;
            else high--;
       }
       return false;


    }
}
