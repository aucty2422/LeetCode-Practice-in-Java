/*
Problem 303. Range Sum Query - Immutable

Approach:
1. Create a prefix sum array to store cumulative sums
2. Calculate the prefix sum while traversing the original array
3. For each query, subtract the prefix sum before the left index from the prefix sum at the right index
4. If left is 0, directly return prefix[right]

Time Complexity: O(n) for preprocessing, O(1) per query
Space Complexity: O(n)
*/

class NumArray {
    int[] prefix;

    public NumArray(int[] nums) {
        prefix = new int[nums.length];
        int sum = 0;

        for(int i = 0; i < nums.length; i++) {
            sum += nums[i];
            prefix[i] = sum;
        }
    }

    public int sumRange(int left, int right) {
        if(left > 0) {
            return prefix[right] - prefix[left - 1];
        }
        return prefix[right];
    }
}
