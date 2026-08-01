/*
Problem 231: Power of Two

Approach:
1. Return false if the number is non-positive.
2. Repeatedly divide the number by 2. If at any step it is not divisible by 2, return false.
3. If the number is reduced to 1, return true.

Time Complexity: O(log n)
Space Complexity: O(1)
*/

class Solution {
    public boolean isPowerOfTwo(int n) {

        if(n<=0) return false;
        while(n>1){
            if(n%2!=0) return false;
            n=n/2;
        }
        return true;
    }
}
