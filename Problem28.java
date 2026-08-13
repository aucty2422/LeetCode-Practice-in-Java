/*
Problem 28: Find the Index of the First Occurence in a String

Approach:
1. Check if needle exists in haystack
2. Use two pointers to create substrings of the same length as needle
3. Compare each substring with needle
4. Return the starting index of the first match

Time Complexity: O(m*n)
Space Complexity: O(m)
*/

class Solution {
    public int strStr(String haystack, String needle) {
        if(haystack.contains(needle)){
            int i=0;
            int j=needle.length()-1;
            while(j<haystack.length()){
                if(haystack.substring(i,j+1).equals(needle)) return i;
                i++;
                j++;
            }
        }
        return -1;
    }
}
