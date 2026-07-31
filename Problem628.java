/*
Problem 628: Maximum Product of Three Numbers

Approach:
1. Sort the array.
2. Calculate the product of the three largest numbers.
3. Calculate the product of the two smallest numbers and the largest number, since two negative numbers can produce a larger positive product.
4. Return the maximum of the two products.

Time Complexity: O(n log n)
Space Complexity: O(1)
*/

class Solution {
    public int maximumProduct(int[] nums) {

        Arrays.sort(nums);

        int n = nums.length;
        int maxPr1 = nums[0] * nums[1] * nums[n - 1];
        int maxPr2 = nums[n - 1] * nums[n - 2] * nums[n - 3];

        return Math.max(maxPr1, maxPr2);

    }
}
