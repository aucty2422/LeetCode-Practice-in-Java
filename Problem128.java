/*
Problem 128: Longest Consecutive Sequence

Approach:
1. Store all elements in a HashSet to allow O(1) average lookup
2. Iterate through the unique elements in the HashSet
3. Start a sequence only when the previous element is not present
4. Keep checking for consecutive elements and count the sequence length
5. Update maxLen with the longest sequence found

Time Complexity: O(n)
Space Complexity: O(n)
*/

class Solution {
    public int longestConsecutive(int[] nums) {
        int maxLen = 0;
        HashSet<Long>set = new HashSet<>();
        for(int i=0;i<nums.length;i++){
            set.add((long)nums[i]);
        }
        
        for(Long ele: set){
            int cnt = 1;
            long current = ele;
            if(!set.contains(current-1)){
                while(set.contains(current+1)){
                    cnt++;
                    current+=1;
                }
                maxLen = Math.max(cnt,maxLen);
            }

        }
        return maxLen;
    }
}
