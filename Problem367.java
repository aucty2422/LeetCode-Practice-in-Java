/*
Problem 367: Valid Perfect Square

Approach:
1. Use binary search from 1 to num 
2. Find the middle value and check if its square is equal to num 
3. If mid^2 is smaller than num, search in the right half 
4. If mid^2 is greater than num, search in the left half 
5. Use long to avoid integer overflow while calculating mid^2

Time Complexity: O(log n)
Space Complexity: O(1)
*/

class Solution {
    public boolean isPerfectSquare(int num) {
        
        int low = 1;
        int high = num;
        while(low<=high){
            int mid = low + (high-low)/2;
            if((long)mid*mid==num) return true;
            else if((long)mid*mid<num){
                low=mid+1;
            }else high = mid-1;
        }
        return false;

    }
}
