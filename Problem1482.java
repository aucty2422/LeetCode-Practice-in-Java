/*
Problem 1482: Minimum Number of Days to Make m Bouquets

Approach:
1. Find the minimum and maximum bloom day as the search range 
2. Binary search for the minimum number of days needed 
3. For each mid, check if at least m bouquets can be made 
4. Count consecutive flowers that have bloomed by mid days 
5. Whenever k consecutive flowers are found, form one bouquet 
6. If m bouquets can be formed, try for fewer days 
7. Otherwise, increase the number of days

Time Complexity: O(n * log(max(bloomDay)))
Space Complexity: O(1)
*/

class Solution {
    public boolean isPossible(int[] arr, int mid, int m,int k){
        int cnt = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<=mid) cnt++;
            else cnt=0;
             if(cnt==k){
                cnt=0;
                m--;
            }
        }
        return m<=0;

    }
  
    public int minDays(int[] bloomDay, int m, int k) {
        
        if((long) bloomDay.length<(long) m*k) return -1;
        int low = bloomDay[0];
        int high = 0;
        for(int i =0;i<bloomDay.length;i++){
            low = Math.min(low,bloomDay[i]);
            high = Math.max(high,bloomDay[i]);
        }

        int ans = -1;
        while(low<=high){
            int mid = low + (high-low)/2;
            if(isPossible(bloomDay,mid,m,k)){
                ans = mid;
                high = mid-1;
            }else low = mid+1;
        }
        return ans;
    }
}
