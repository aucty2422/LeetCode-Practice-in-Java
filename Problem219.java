/*
Problem 219: Contains Duplicate II

Approach:
1. Use a HashMap to store each element along with its most recent index
2. If the element is already present, check if the difference between the current index and its previous index is less than or equal to k
3. If the condition is satisfied, return true
4. Otherwise, update the element's index with its current index
5. If no such pair is found, return false

Time Complexity: O(n)
Space Complexity: O(n)
*/

class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                if (i - map.get(nums[i]) <= k) return true;
            }
            map.put(nums[i], i);

        }
        return false;

    }
}
