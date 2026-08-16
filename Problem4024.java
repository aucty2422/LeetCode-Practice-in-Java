/*
Problem 4024: Nearest Available Drone

Approach:
1. Traverse through all the drones and calculate the Manhattan distance from the target
2. Check if the drone is available by verifying if its range is >= the distance
3. Keep track of the drone with the minimum distance
4. If two drones have the same distance, choose the one with the smaller index
5. Return -1 if no drone is available

Time Complexity: O(n)
Space Complexity: O(1)
*/
class Solution {
    public int nearestDrone(int[][] drones, int[] target) {

        int mini = Integer.MAX_VALUE;
        int idx = Integer.MAX_VALUE;
        boolean flag = false;
        for(int i=0;i<drones.length;i++){
                int x = Math.abs(target[0]-drones[i][0]);
                int y = Math.abs(target[1]-drones[i][1]);
                if(x+y<=drones[i][2]){
                    if(mini>x+y){
                        mini=x+y;
                        idx=i;
                        flag = true;
                    }else if(mini==x+y){
                        if(i<idx) idx=i;
                        flag=true;
                    }           
                }

        }
        if(flag==false) return -1;
        return idx;
    }
}
