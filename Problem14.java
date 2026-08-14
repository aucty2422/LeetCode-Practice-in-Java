/*
Problem 14: Longest Common Prefix

Approach:
1.First, sort the strings.
2.Then compare the first and last strings, as they will have the least common prefix.
3.Compare their characters one by one and add the matching characters to the answer.

Time Complexity: O(n log n * m)
Space Complexity: O(1)
*/

class Solution {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        String first = strs[0];
        String last = strs[strs.length-1];
        int i=0;
        int j=0;
        StringBuilder ans = new StringBuilder("");
        while(i<first.length() && j<last.length()){
            if(first.charAt(i)==last.charAt(j)){
                ans.append(first.charAt(i));
                i++;
                j++;
            }else{
                break;
            }
        }
        return ans.toString();
    }
}
