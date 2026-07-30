/*
Problem 509: Fibonacci Number

Approach: (Recursion)
1. If n is 0 or 1, return n.
2. Otherwise, return fibonacci(n-1) + fibonacci(n-2).

Time Complexity: O(2^n)
Space Complexity: O(n)
*/

class Solution {
    public int fibonacci(int n){

        if(n==0) return 0;
        if(n==1) return 1;
        int current = fibonacci(n-1)+fibonacci(n-2);
        return current;
    }
  
    public int fib(int n) {
        
        return fibonacci(n);
        


    }
}
