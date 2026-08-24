/*
Problem 424: Longest Repeating Character Replacement

Approach:
1. Use a sliding window to maintain the current substring
2. Store the frequency of each character in the window using a hash array
3. Keep track of the maximum frequency character in the current window
4. The number of changes required is:
   - window length - maximum frequency
5. If changes > k, shrink the window from the left
6. Update the maximum valid window length

Time Complexity: O(n)
Space Complexity: O(1)
*/

class Solution {
    public int characterReplacement(String s, int k) {
        
        int i=0;
        int j=0;
        int maxLen=0;
        int maxFreq =0;
        int[] hash = new int[26];
        while(j<s.length()){
            char ch = s.charAt(j);
            hash[ch-'A']++;
            maxFreq = Math.max(maxFreq,hash[ch-'A']);
            while((j-i+1)-maxFreq>k){
                hash[s.charAt(i)-'A']--;
                maxFreq=0;
                for(int l=0;l<26;l++) maxFreq=Math.max(maxFreq,hash[l]);
                i++;
            }
            if((j-i+1)-maxFreq<=k){
                maxLen=Math.max(maxLen,j-i+1);
            }

            j++;
        }
        return maxLen;



    }
}
