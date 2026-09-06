/*
Problem 1011: Capacity To Ship Packages Withing D Days

Approach:
1.Use Binary Search on the possible shipping capacity
2.Set the lower bound as the maximum weight and the upper bound as the total weight of all packages
3.Calculate the number of days required to ship all packages for the current capacity
4.If the required days are less than or equal to the given days, store the capacity as the answer and search for a smaller capacity
5.Otherwise, increase the capacity and continue searching

Time Complexity: O(n * log m)
Space Complexity: O(1)
*/

class Solution {
    public int calDays(int[] arr, int mid){
        int d = 0;
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
            if(sum>mid){
                sum=arr[i];
                d++;
            }
        }
        d++;
        return d;

    }
  
    public int shipWithinDays(int[] weights, int days) {
        
        int low = 0;
        int high = 0;
        for(int i=0;i<weights.length;i++){
            low=Math.max(low,weights[i]);
            high+=weights[i];
        }

        int ans = 0;
        while(low<=high){
            int mid = low + (high-low)/2;
            if(calDays(weights,mid)<=days){
                ans=mid;
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return ans;

    }
}
