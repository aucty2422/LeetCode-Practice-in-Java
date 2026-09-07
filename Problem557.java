/*
Problem 557: Reverse Words in a String III

Approach: 
1. Split the string into individual words 
2. Reverse each word using StringBuilder 
3. Append the reversed words to the result with spaces between them

Time Complexity: O(n)
Space Complexity: O(n)
*/

class Solution {
    public String reverseWords(String s) {

        String[] words = s.split(" ");
        StringBuilder[] sb = new StringBuilder[words.length];
        for(int i=0;i<words.length;i++){
            sb[i] = new StringBuilder(words[i]);
            sb[i].reverse();
        }

         StringBuilder ans = new StringBuilder();

        for(int i = 0; i < sb.length; i++){
            ans.append(sb[i]);

            if(i < sb.length - 1) {
                ans.append(" ");
            }
        }

        return ans.toString();
    }
}
