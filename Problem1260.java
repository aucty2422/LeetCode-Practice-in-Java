/*
Problem: Shift 2D Grid

Approach:
1. Flatten the 2D array to 1D and store in list
2. Rotate the list
3. Store the elements in a 2D list

Time Complexity: O((m*n)^2)
Space Complexity: O(m*n)
*/

class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        
        //Brute-Force-Approach

        //arraylist to store all the elements
        List<Integer> list = new ArrayList<>();
        //Traverse the grid and put all the elements in the list
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                list.add(grid[i][j]);
            }
        }
        //Rotate the list 
        k%=list.size();
        while(k>0){
            int temp = list.get(list.size()-1);
            for(int i=list.size()-1;i>0;i--){
                list.set(i,list.get(i-1));
            }
            list.set(0,temp);
            k--;
        }
        //store the elements of the list in 2D arrayList
        List<List<Integer>> ans = new ArrayList<>();
        int cnt = 0;
        for(int i=0;i<grid.length;i++){
            List<Integer> local = new ArrayList<>();
            for(int j = 0;j<grid[0].length;j++){
                local.add(list.get(cnt));
                cnt++;
            }
            ans.add(local);
        }
        return ans;

    }
}
