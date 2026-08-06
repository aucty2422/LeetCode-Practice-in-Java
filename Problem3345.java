/*
Problem 3345: Smallest Divisible Digit Product I

Approach:
1. Since t is at most 10, a valid answer is guaranteed to exist within the next
   10 numbers.
2. Iterate from n to n + 10.
3. Compute the product of digits for each number.
4. Return the first number whose digit product is divisible by t.

Time Complexity: O(1), 11 numbers are checked and each number has at most 3 digits
Space Complexity: O(1)
*/

class Solution {
    public int digitsProduct(int num){

        int product = 1;
        while(num>0){
            int rem = num%10;
            product*=rem;
            num/=10;
        }
        return product;

    }
    public int smallestNumber(int n, int t) {
        
        for(int i=n;i<=n+10;i++){
            if(digitsProduct(i)%t==0) return i;
        }

        return -1;

    }
}
