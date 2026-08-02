/*
Problem 4010: Maximize Pair Strength Using GCD

Approach: 
1. Check for each pair using nested for loop
2. Compute the GCD of each pair
3. Calculate the pair strength using the given formula
4. Update the maximum strength found so far

Time Complexity: O(n² × log(max(nums)))
Space Complexity: O(1)
*/

class Solution {
    public int gcd(int a, int b) {

        while (b != 0) {
            int rem = a % b;
            a = b;
            b = rem;
        }
        return Math.abs(a);
    }

    public long maxPairStrength(int[] nums) {

        long maxStrength = Long.MIN_VALUE;

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                int maxi = Math.max(nums[i], nums[j]);
                int mini = Math.min(nums[i], nums[j]);
                int gcd = gcd(maxi, mini);
                long strength = ((long) nums[i] * nums[j]) / ((long) gcd * gcd);
                maxStrength = Math.max(strength, maxStrength);
            }
        }

        return maxStrength;
        
    }
}
