/*
Problem 77: Combinations

Approach:
1. Use backtracking to generate all combinations of k numbers from 1 to n
2. Add the current number to the list and recursively explore the next numbers
3. Start the next recursive call from j + 1 to avoid repeating numbers
4. When the list size becomes k, add a copy of the list to the result
5. Backtrack by removing the last added number to explore other combinations

Time Complexity: O(k * C(n, k))
Space Complexity: O(k) auxiliary space, excluding the output
*/

class Solution {
    public void fun(int num, int n,int k, List<Integer> list, List<List<Integer>> list2d){
        if(list.size()==k){
            list2d.add(new ArrayList<>(list));
            return;
        }
        if(num>n) return;
        for(int j=num; j<=n; j++){
            list.add(j);
            fun(j+1,n,k,list,list2d);
            list.remove(list.size()-1);
        }
    }
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> list2d = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        fun(1,n,k,list,list2d);
        return list2d;
    }
}
