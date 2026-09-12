/*
Problem 1552: Magnetic Force Between Two Balls

Approach: 
1. Sort the array 
2. Set the search space from 1 to the maximum possible distance 
3. For each mid, check if m balls can be placed with at least mid distance between them 
4. If possible, search for a larger distance on the right side 
5. Otherwise, search on the left side 
6. Store the maximum possible distance in ans 

Time Complexity: O(n log n + n * log(max(position)))
Space Complexity: O(1)
*/

class Solution {
    public boolean isPossible(int[] arr, int mid, int m){
        m--;
        int post = arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]-post>=mid){
                m--;
                post = arr[i];
            }
        }
        return m<=0;
    }
    public int maxDistance(int[] position, int m) {
        
        Arrays.sort(position);
        int low = 1;
        int high = position[position.length-1] - position[0];
        int ans = 0;
        while(low<=high){
            int mid = low + (high-low)/2;
            if(isPossible(position,mid,m)){
                ans=mid;
                low=mid+1;
            }else high = mid-1;
        }
        return ans;

    }
}
