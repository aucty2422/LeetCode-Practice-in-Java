/*
Problem 1922: Count Good Numbers

Approach:
1. Count positions with 5 choices (even indices) and 4 choices (odd indices)
2. Use binary exponentiation to calculate 5^even and 4^odd under modulo 10^9+7
3. Multiply both results and take modulo 10^9+7
4. Return the final result

Time Complexity: O(log n)
Space Complexity: O(log n)
*/

class Solution {
    public long findPower(int a, long b){
        if(b==0) return 1;
        long half = findPower(a,b/2);
        long result = (half * half)%1000000007;
        if(b%2==1) result*=a;
        return result%1000000007;

    }
    public int countGoodNumbers(long n) {
        long odd = n/2;
        long even = n - odd;
        long goodNum = (findPower(5,even) * findPower(4,odd))%1000000007;
        return (int)goodNum;
    }
}
