/*
Problem 216: Combination Sum III

Approach:
1. Use backtracking to find combinations of k distinct numbers from 1 to 9
2. Maintain the current sum and list of selected numbers
3. Start the next recursive call from j + 1 to avoid reusing numbers
4. Prune the search if the sum exceeds the target or the list reaches size k
5. Stop the loop when adding the current number exceeds the target
6. Add a copy of the list when the sum equals the target and the list contains k numbers

Time Complexity: O(2^9 + k * R), where R is the number of valid combinations
Space Complexity: O(k) auxiliary space, excluding the output
*/

class Solution {
    public void fun(int num, int k, int sum, int target, List<Integer> list, List<List<Integer>> list2d ){
        if(sum==target && list.size()==k){
            list2d.add(new ArrayList<>(list));
            return;
        }
        if(sum>target || list.size()>=k) return;
        for(int j=num; j<=9; j++){
            if(sum+j>target) break;
            sum+=j;
            list.add(j);
            fun(j+1,k,sum,target,list,list2d);
            sum-=j;
            list.remove(list.size()-1);
        }
    }
    public List<List<Integer>> combinationSum3(int k, int target) {
        List<Integer> list = new ArrayList<>();
        List<List<Integer>> list2d = new ArrayList<>();
        int sum = 0;
        fun(1,k,sum,target,list,list2d);
        return list2d;
    }
}
