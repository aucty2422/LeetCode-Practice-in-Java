/*
Problem 22: Generate Parentheses

Approach:
1. Use recursion to generate valid parentheses strings
2. Track the number of opening and closing brackets
3. Add an opening bracket if open < n
4. Add a closing bracket if open > close
5. When the string length reaches 2*n, add it to the result list

Time Complexity: O(4^n / sqrt(n))
Space Complexity: O(n) auxiliary space (excluding the output list)
*/

class Solution {
    public void fun(String s, int open, int close, List<String> list, int n){
        if(open>n) return;
        if(open+close==2*n && open==close){
            list.add(s);
            return;
        }
        fun(s+"(",open+1,close,list,n);
        if(open>close){
            fun(s+")",open,close+1,list,n);
        }
    }
    public List<String> generateParenthesis(int n) {
        List<String> list = new ArrayList<>();
        fun("",0,0,list,n);
        return list;
    }
}
