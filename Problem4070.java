/*
Problem 4070: Minimum Rotations to Dial a Number I

Approach:
1. Calculate the rotations needed to move from 0 to the first digit
2. For every next digit, calculate the clockwise and anticlockwise rotations from the previous digit
3. Add the minimum of the two rotations to the total

Time Complexity: O(n)
Space Complexity: O(1)
*/
class Solution {
    public int minRotations(String s) {

        int rot = s.charAt(0) - '0';
        if(rot>5){
            rot = 10 - rot;
        }
        
        for(int i=1;i<s.length();i++){
            int num  = s.charAt(i) - '0';
            int prev = s.charAt(i-1) - '0';
            int val = 0;
            if(prev<num){
                val = Math.min(10 - num + prev,num-prev);
            }else {
                val = Math.min(10 - prev + num,prev-num);
            }
            rot+=val;
        }
        return rot;
    }
}
