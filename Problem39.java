/*
Problem 39: Combination Sum

Approach:
1. At every index, make two choices: take the current element or skip it
2. If the element is taken, stay at the same index because the same element can be reused
3. If the current sum becomes equal to the target, add the current combination to the answer
4. If the sum exceeds the target, stop that recursive branch
5. Backtrack by removing the last element
6. If the element is skipped, move to the next index

Time Complexity: O(2^(n + T/m)) , T = target, m = smallest candidate, n = number of candidates
Space Complexity: O(n + T/m)
*/
class Solution {
    public void fun(int i, int[] arr, int sum, int target, List<Integer> list, List<List<Integer>> list2d) {

        if (sum == target) {
            list2d.add(new ArrayList<>(list));
            return;
        }
        if (sum>target || i>=arr.length) return;
        
        sum += arr[i];
        list.add(arr[i]);
        fun(i, arr, sum, target, list, list2d);
        sum -= arr[i];
        list.remove(list.size() - 1);
        fun(i + 1, arr, sum, target, list, list2d);
    }

    public List<List<Integer>> combinationSum(int[] candidates, int target) {

        List<List<Integer>> list2d = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        int sum = 0;
        fun(0, candidates, sum, target, list, list2d);
        return list2d;

    }
}
