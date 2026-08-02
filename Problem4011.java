/*
Problem 4011: Count Subarrays With Even Odd Ratio I

Approach:
1. Iterate through every possible subarray.
2. Maintain counts of even and odd elements for the current subarray.
3. If even * b <= odd * a, increment the answer.

Time Complexity: O(n²)
Space Complexity: O(1)
*/

class Solution {

    public int countRatioSubarrays(int[] arr, int a, int b) {
        int cnt = 0;
        for(int i=0;i<arr.length;i++){
            int even = 0;
            int odd = 0;
            for(int j=i;j<arr.length;j++){
                if(arr[j]%2==0) even++;
                else odd++;
                if((long)even*b<=(long)odd*a){
                    cnt++;
                }
                
            }
        }

        return cnt;
    }
}
