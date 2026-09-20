/*
Problem 3498: Reverse Degree of a String

Approach:
1. Traverse the string from left to right
2. Calculate the reverse alphabetical value of each character using z - ch + 1
3. Multiply the character value by its position, starting from 1
4. Add the result to sum
5. Return the final sum

Time Complexity: O(n)
Space Complexity: O(1)
*/
class Solution {
    public int reverseDegree(String s) {
        int sum = 0;
        int pos = 1;
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            sum+=pos*('z'-ch+1);
            pos++;
        }
        return sum;
    }
}
