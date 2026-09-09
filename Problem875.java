/*
Problem 875: Koko Eating Bananas

Approach:
1. Use Binary Search on the possible eating speed 
2. The minimum possible speed is 1 and the maximum possible speed is max(piles) 
3. For each mid speed, calculate the total hours required to eat all bananas 
4. If the required hours are less than or equal to h, store mid as the answer and search for a smaller speed 
5. Otherwise, increase the eating speed by moving low to mid + 1 
6. Return the minimum valid eating speed

Time Complexity: O(n * log(max(piles)))
Space Complexity: O(1)
*/

class Solution {
    public int hours(int[] arr, int mid){
        int hrs = 0;
        for(int i=0;i<arr.length;i++){
            hrs+=Math.ceil((double) arr[i]/mid);
        }
        return hrs;
    }
    public int minEatingSpeed(int[] piles, int h) {
        
        int high = 0;
        for(int i=0; i<piles.length;i++){
            high = Math.max(piles[i],high);
        }
        int low = 1;
        int ans = 0;
        while(low<=high){
            int mid = low + (high-low)/2;
            if(hours(piles,mid)<=h){
                ans = mid;
                high = mid-1;
            }else low = mid+1;
        }
        return ans;



    }
}
