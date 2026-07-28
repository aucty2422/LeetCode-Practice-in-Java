/*
Problem 69: Sqrt(x)

Approach:
1. Apply Binary Search on the range [0, x]
2. If mid * mid <= x, store mid as the answer and search on the right
3. Otherwise, search on the left
4. Continue until the search ends
5. Return the stored answer, which is the floor value of √x

Time Complexity: O(log n)
Space Complexity: O(1)
*/

class Solution {
    public int mySqrt(int x) {
        
        int ans = -1;
        int low = 0;
        int high = x;
        while(low<=high){
            int mid = low + (high-low)/2;
            if((long)mid*mid<=x) {
                ans = mid;
                low = mid + 1;
            }else{
                high = mid - 1;
            }
        }
        return ans;
    }
}
