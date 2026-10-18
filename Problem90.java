/*
Problem 90: Subsets II

Approach:
1. Sort the array to group duplicate elements together
2. Use backtracking to generate all possible subsets
3. Skip duplicate elements at the same recursion level to avoid duplicate subsets
4. Add a copy of the current subset to the result at each recursive call

Time Complexity: O(n * 2^n)
Space Complexity: O(n) auxiliary space, excluding the output
*/

class Solution {
    public void fun(int start, int[] arr, List<Integer> list, List<List<Integer>> list2d){

        list2d.add(new ArrayList<>(list));

        for(int i=start; i<arr.length; i++){

            if(i>start && arr[i]==arr[i-1]) continue;
            list.add(arr[i]);
            fun(i+1,arr,list,list2d);
            list.remove(list.size()-1);

        }
    }
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> list2d = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        fun(0, nums, list, list2d);
        return list2d;

    }
}
