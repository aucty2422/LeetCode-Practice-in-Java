/*
Problem 50: Pow(x,n)

Approach:
1. Convert the exponent from int to long to safely handle Integer.MIN_VALUE
2. If n is negative, make it positive and take the reciprocal of the result
3. Recursively divide n by 2 to calculate x^n using binary exponentiation
4. If n is even, square the result of x^(n/2)
5. If n is odd, square the result and multiply it by x

Time Complexity: O(log n)
Space Complexity: O(log n)
*/

class Solution {
    public double power(double x,long n){
        if(n==1) return x;
        
        double call = power(x,n/2);
        
        if(n%2==0){
            return call*call;
        }
        else return call*call*x;
    }

    public double myPow(double x, int n) {
        if(x==0) return 0;
        
        long N=n;
        
        if(n==0) return 1;
        else if(n<0){
            N=-N;
            double val = 1/power(x,N);
            return val;
        }
        else{
            return power(x,N);
        }
    }
}
