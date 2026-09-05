/*
Problem 2965: Find Missing and Repeated Values

Approach: 
1. Calculate the sum and sum of squares of all elements in the grid 
2. Calculate the expected sum and sum of squares for numbers from 1 to n 
3. Find (repeated - missing) using the difference between actual and expected sums 
4. Find (repeated + missing) using the difference between the sums of squares 
5. Use these two equations to calculate the repeated and missing values

Time Complexity: O(n*n)
Space Complexity: O(1)
*/

class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        long sum = 0;
        long sum2 = 0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                sum+=grid[i][j];
                sum2+=grid[i][j]*grid[i][j];
            }
        }

        long m = (long) grid.length*grid.length;
        long Sn = m*(m+1)/2;

        long Sn2 = m*(m+1)*(2*m+1)/6;

        long diff = sum - Sn;
        long squareDiff = sum2 - Sn2;

        long sumAB = squareDiff / diff;

        long repeated = (sumAB + diff) / 2;
        long missing = (sumAB - diff) / 2;

        return new int[]{(int) repeated,(int) missing};
        

    }
}
