/*
Problem 40: Combination Sum II

Approach:
1. Sort the array to handle duplicates
2. Use for-loop recursion to try each possible element
3. Move to j+1 since each element can be used only once
4. Skip duplicate elements at the same recursion level
5. Use backtracking to remove the selected element

Time Complexity: O(2^n * n)
Space Complexity: O(2^n * n)
*/


class Solution {
    public void fun(int i, int[] arr,int sum, int target,ArrayList<Integer> list, List<List<Integer>> list2d){
        
        if (sum == target) {
            list2d.add(new ArrayList<>(list));
            return;
        }
        if (sum > target || i >= arr.length) return;

        for(int j=i;j<arr.length;j++){
            if (j > i && arr[j] == arr[j-1]) continue;

            sum+=arr[j];
            list.add(arr[j]);

            fun(j+1,arr,sum, target, list, list2d);

            sum-=arr[j];
            list.remove(list.size()-1);
        }
    }
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        
        Arrays.sort(candidates);

        List<List<Integer>> list2d = new ArrayList<>();
        HashSet<ArrayList<Integer>> set = new HashSet<>();
        ArrayList<Integer> list = new ArrayList<>();
        int sum = 0;
        fun(0,candidates,sum, target,list,list2d);
        
        return list2d;
    }
}
