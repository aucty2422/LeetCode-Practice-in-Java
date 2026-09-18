/*
Problem 326: Power of Three

Approach:
1. Return false if n is less than or equal to 0
2. Keep dividing n by 3 while n is greater than 1
3. If n is not divisible by 3 at any step, return false
4. If n becomes 1, return true

Time Complexity: O(log n)
Space Complexity: O(1)
*/

class Solution {
    public boolean isPowerOfThree(int n) {
        
        if(n<=0) return false;
        while(n>1){
            if(n%3!=0) return false;
            n=n/3;
        }
        return true;

    }
}
