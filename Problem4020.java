/*
Problem 4020: Elevator Requests I

Approach:
1. Start from the ground floor (0).
2. For each request, calculate the absolute difference between the current floor and the requested floor.
3. Add this difference to the total time and update the current floor.
4. Since the elevator moves one floor per second, the total movement is the total time.

Time Complexity: O(n)
Space Complexity: O(1)
*/
class Solution {
    public int elevatorRequests(int n, int[] arr) {

        int req = 0;
        int time=0;
        for(int i = 0;i<arr.length;i++){
            time+=Math.abs(arr[i]-req);
            req=arr[i];
        }
        return time;
    }
}
