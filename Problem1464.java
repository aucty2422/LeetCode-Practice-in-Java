/*
Problem 1464: Maximum Product of Two Elements in an Array

Approach:
1. Sort the array.
2. Take the largest and second largest elements.
3. Compute (largest - 1) * (secondLargest - 1).
4. Return the product.

Time Complexity: O(n log n)
Space Complexity: O(log n)  // Average for Java's Arrays.sort(int[])
*/

class Solution {
    public int maxProduct(int[] nums) {

        Arrays.sort(nums);
        return (nums[nums.length - 1] - 1) * (nums[nums.length - 2] - 1);

    }
}

// Note: Find largest and second largest element by traversing the array, TC: O(n) -> Optimal Solution
