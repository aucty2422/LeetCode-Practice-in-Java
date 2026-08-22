/*
Problem 3622: Check Divisibility by Digit Sum and Product

Approach:
1. Store a copy of the original number because n is modified while extracting digits
2. Calculate the sum and product of all digits of the number
3. Calculate the sum of digit sum and digit product
4. Check if the original number is divisible by this value

Time Complexity: O(k), where k is the number of digits in the number
Space Complexity: O(1)
*/
class Solution {
    public boolean checkDivisibility(int n) {
        int copy=n;
        int sum=0;
        int pro=1;
        while(n>0){
            int rem = n%10;
            sum+=rem;
            pro*=rem;
            n/=10;
        }
        int val = sum+pro;
        if(copy%val==0) return true;
        return false;
    }
}
