/*
Problem 4030: Check ASCII Palindrome

Approach:
1. Calculate the ASCII value of each character
2. Convert the ASCII value into its binary representation using recursion
3. Since the binary digits are generated from least significant bit to most significant bit, reverse the binary string
4. Append the reversed binary representation of each character to a StringBuilder
5. Use two pointers to check whether the complete binary string is a palindrome

Time Complexity: O(n)
Space Complexity: O(n)
*/

class Solution {
    public String binary(int ascii,String ans, int n){
        if(n>8) return ans;
        return binary(ascii/2,ans+ascii%2,n+1);
    }
    public boolean isPalindromic(String s) {

        StringBuilder ans = new StringBuilder();
        int i=0;
        while(i<s.length()){
            int ascii = (int) s.charAt(i);
            String bin = binary(ascii,"",1);
            StringBuilder sb = new StringBuilder(bin);
            sb.reverse();
            ans.append(sb);
            i++;
        }
        int j=0;
        int k=ans.length()-1;
        while(j<k){
            if(ans.charAt(j)!=ans.charAt(k)) return false;
            j++;
            k--;
        }
        return true;
    }
}
