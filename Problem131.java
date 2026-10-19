/*
Problem 131: Palindrome Partitioning

Approach:
1. Use backtracking to find all possible palindrome partitions
2. Check each substring for palindrome using two pointers
3. If it is a palindrome, add it to the current list and recursively partition the remaining string
4. Backtrack by removing the last added substring
5. When the entire string is partitioned, add a copy of the current list to the result

Time Complexity: O(n * 2^n)
Space Complexity: O(n) auxiliary space, excluding the result
*/

class Solution {
    public boolean isPalindrome(String s){
        int i=0;
        int j=s.length()-1;
        while(i<j){
            if(s.charAt(i)!=s.charAt(j)) return false;
            i++;
            j--;
        }
        return true;
    }
    public void fun(String s, int idx, List<String>current, List<List<String>> result){
        if(idx==s.length()){
            result.add(new ArrayList<>(current));
            return;
        }
        for(int i=idx;i<s.length();i++){
            if(isPalindrome(s.substring(idx,i+1))){
                current.add(s.substring(idx,i+1));
                fun(s,i+1,current,result);
                current.remove(current.size()-1);
            }
        }
    }
    public List<List<String>> partition(String s) {
        List<List<String>> result = new ArrayList<>();
        List<String> current = new ArrayList<>();
        int idx = 0;
        fun(s,idx,current,result);
        return result;
    }
}
