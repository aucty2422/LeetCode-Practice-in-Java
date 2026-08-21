/*
Problem 1423: Maximum Points You Can Obtain from Cards

Approach
1. First, consider taking all k cards from the beginning and calculate their sum
2. Then, one by one, replace cards taken from the beginning with cards taken from the end
3. For each replacement:
   - subtract one card from the left
   - add one card from the right
   - update the maximum sum

Time Complexity: O(n)
Space Complexity: O(1)
*/

class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int n = cardPoints.length;
        int leftsum=0;
        for(int i=0;i<k;i++){
            leftsum+=cardPoints[i];
        }

        int maxSum=leftsum;
        int rightsum=0;
        int i=k-1;
        int j=n-1;
        while(i>=0 && j>=0){
            leftsum-=cardPoints[i--];
            rightsum+=cardPoints[j--];
            maxSum=Math.max(maxSum,leftsum+rightsum);
        }
        return maxSum;
    }
}
