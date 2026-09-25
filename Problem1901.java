/*
Problem 1901: Find a Peak Element II

Approach:
1. Apply binary search on the columns 
2. For each middle column, find the row containing the maximum element in that column 
3. Compare this element with its left and right neighbours 
4. If it is greater than both, it is a peak element 
5. If the left neighbour is greater, search in the left half 
6. Otherwise, search in the right half

Time Complexity: O(n * log m)
Space Complexity: O(1)
*/

class Solution {
    public int maxEleRow(int[][] arr, int mid){
        int row = 0;
        int max = -1;
        for(int i=0;i<arr.length;i++){
            if(arr[i][mid]>max){
                row = i;
                max = arr[i][mid];
            }
        }
        return row;
    }
    public int[] findPeakGrid(int[][] mat) {
        int m = mat.length;
        int n = mat[0].length;
        int low = 0;
        int high = n-1;
        while(low<=high){
            int mid = low + (high-low)/2;
            int row = maxEleRow(mat,mid);
            int left = mid-1>=0 ? mat[row][mid-1] : -1;
            int right = mid+1 < n ? mat[row][mid+1] : -1;
            if(mat[row][mid]>left && mat[row][mid]>right ){
                return new int[]{row,mid};
            }else if(mat[row][mid]<left) high = mid -1;
            else low = mid + 1;
        }
        return new int[]{-1,-1};
    }
}
