/*
Problem 229: Majority Element II

Approach:
1. Use the Boyer-Moore Voting Algorithm to find two possible majority elements
2. Since an element must appear more than n/3 times, there can be at most two majority elements
3. Keep track of two candidates and their respective counts
4. When a candidate's count becomes 0, choose a new candidate while making sure the two candidates are different
5. Increase the count when the current element matches a candidate
6. If it matches neither candidate, decrease both counts
7. Traverse the array again to count the actual occurrences of both candidates
8. Add a candidate to the result only if it appears more than n/3 times

Time Complexity: O(n)
Space Complexity: O(1)
*/

class Solution {
    public List<Integer> majorityElement(int[] nums) {
        
        int cnt1 = 0;
        int ele1 = 0;

        int cnt2 = 0;
        int ele2 = 0;

        for(int i=0;i<nums.length;i++){
            if(cnt1==0 && nums[i]!=ele2){
                cnt1=1;
                ele1 = nums[i];
            }
            else if(cnt2==0 && nums[i]!=ele1){
                cnt2=1;
                ele2 = nums[i];
            }
            else if(nums[i]==ele1) cnt1++;
            else if(nums[i]==ele2) cnt2++;
            else {
                cnt1--;
                cnt2--;
            }
        }

        List<Integer> ans = new ArrayList<>();
        cnt1=0;
        cnt2=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==ele1) cnt1++;
            else if(nums[i]==ele2) cnt2++;
        }

        if(cnt1>nums.length/3) ans.add(ele1);
        if(cnt2>nums.length/3) ans.add(ele2);
        return ans;

    }
}
