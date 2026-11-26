/*
Problem 643. Maximum Average Subarray I

Approach:
1. Calculate the sum of the first k elements
2. Use a fixed-size sliding window to traverse the remaining array
3. Subtract the outgoing element and add the incoming element to update the window sum
4. Calculate the average and update the maximum average
5. Return the maximum average

Time Complexity: O(n)
Space Complexity: O(1)
*/

class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int sum = 0;

        for(int i = 0; i < k; i++) {
            sum += nums[i];
        }
        double avg = (double) sum / k;
        int i = 1;
        int j = k;
        while(j < nums.length) {
            sum -= nums[i - 1];
            sum += nums[j];
            double cal = (double) sum / k;
            avg = Math.max(avg, cal);
            i++;
            j++;
        }

        return avg;
    }
}
