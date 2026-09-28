/*
Problem 342: Power of Four

Approach:
1. If n is less than or equal to 0, return false
2. Keep dividing n by 4 while it is completely divisible by 4
3. If the final value is 1, then n is a power of 4, otherwise it is not

Time Complexity: O(log n)
Space Complexity: O(1)
*/

class Solution {
    public boolean isPowerOfFour(int n) {
        if(n<=0) return false;
        while(n%4==0){
            n/=4;
        }
        return n==1;
    }
}
