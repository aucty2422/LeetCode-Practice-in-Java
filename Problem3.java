/*
Problem 3: Longest Substring Without Repeating Characters

Approach:
1. Use a HashMap to store each character and its latest index
2. Use two pointers i and j to maintain a sliding window of non-repeating characters
3. If the current character is already present in the map, move i to the next position after its previous occurrence
4. Use Math.max() so that i never moves backwards
5. Update the character's index in the HashMap and calculate the maximum length

Time Complexity: O(n)
Space Complexity: O(n)
*/

class Solution {
    public int lengthOfLongestSubstring(String s) {
        
        HashMap<Character,Integer> map = new HashMap<>();
        int maxLen=0;
        int i=0;
        int j=0;
        while(j<s.length()){
            char ch = s.charAt(j);
            if(map.containsKey(ch)){
                int l = map.get(ch);
                map.put(ch,j);
                i=Math.max(i,l+1);
            }
            map.putIfAbsent(ch,j);
            maxLen=Math.max(maxLen,j-i+1);
            j++;
        }
        return maxLen;

    }
}
