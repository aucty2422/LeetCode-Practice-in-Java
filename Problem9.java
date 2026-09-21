/*
Problem 9: Palindrome Number

Approach:
1. Store the original number in a variable
2. Use while loop till the number is greater than 0
3. Extract the last digit using modulo operator
4. Add the digit to the reversed number
5. Remove the last digit from the original number
6. Compare the reversed number with the original number

Time Complexity: O(log n)
Space Complexity: O(1)
*/
class Solution {
    public boolean isPalindrome(int x) {
        int rev = 0;
        int original = x;
        while(x>0){
            int rem = x%10;
            rev=10*rev+rem;
            x/=10;
        }
        if(rev==original) return true;
        return false;
    }
}
