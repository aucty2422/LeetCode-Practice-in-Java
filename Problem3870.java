/*
Problem 3870: Count Commas in Range

Approach:
1. Numbers less than 1000 do not contain any commas 
2. Every number from 1000 onwards contains at least one comma 
3. Return the count of numbers in the range [1000, n]

Time Complexity: O(1)
Space Complexity: O(1)
*/

class Solution {
    public int countCommas(int n) {
        
        if(n<1000) return 0;
        return n-1000+1;
    }
}
