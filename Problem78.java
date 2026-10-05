/*
Problem 78: Subsets

Approach:
1. At every index, make two choices: include the current element or exclude it
2. Add the current element to the list and recursively generate subsets
3. Backtrack by removing the element
4. Recursively generate subsets without including the element
5. When all elements are processed, add the current list to the answer

Time Complexity: O(2^n)
Space Complexity: O(n) recursion stack + O(2^n × n) output space
*/

class Solution {
    public void generateSubsets(int[] nums,int i, List<Integer> list, List<List<Integer>> ans){
        if(i>=nums.length){
            ans.add(new ArrayList<>(list));
            return;
        }
        list.add(nums[i]);
        generateSubsets(nums,i+1,list,ans);
        list.remove(list.size()-1);
        generateSubsets(nums,i+1,list,ans);
    }
  
    public List<List<Integer>> subsets(int[] nums) {
        List<Integer> list = new ArrayList<>();
        List<List<Integer>> ans = new ArrayList<>();
        generateSubsets(nums,0,list, ans);
        return ans;
    }
}
