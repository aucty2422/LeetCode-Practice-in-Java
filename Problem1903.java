/*
Problem 1903: Largest Odd Number in String

Approach:
1.Use two pointers, i from the beginning and j from the end of the string
2.Move i forward to skip leading zeroes
3.Move j backward until an odd digit is found
4.If an odd digit is found, return the substring from i to j+1
5.If no odd digit is found, return an empty string

Time Complexity: O(n)
Space Complexity: O(1)
*/

class Solution {
    public String largestOddNumber(String s) {
        int i=0;
        int j  = s.length()-1;
        while(j>=0){
            while(i <= j && s.charAt(i) == '0') i++;
            if(s.charAt(j)%2==0){
                j--;
            }else{
                return s.substring(i,j+1);
            }
        }
        return "";
    }
}
