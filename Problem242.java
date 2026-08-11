/*
Problem: 242: Valid Anagram

Approach:
1. Convert both strings into character arrays
2. Sort both character arrays
3. Compare both sorted arrays; if they are unequal, return false
4. If both sorted arrays are equal, return true

Time Complexity: O(n log n)
Space Complexity: O(n)
*/

class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()) return false;
        char[] s1 = new char[s.length()];
        char[] t1 = new char[t.length()];

        for(int i=0;i<s.length();i++){
            s1[i] = s.charAt(i);
        }
        for(int i=0;i<t.length();i++){
            t1[i] = t.charAt(i);
        }

        Arrays.sort(s1);
        Arrays.sort(t1);
        if(!Arrays.equals(s1,t1)) return false;
        return true;
    }
}
