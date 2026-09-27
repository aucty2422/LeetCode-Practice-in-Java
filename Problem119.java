/*
Problem 119: Pascal's Triangle II

Approach:
1. Start with 1 as the first element
2. Use the previous element to calculate the next element using the combination formula
3. Add each calculated element to the list
4. Add 1 as the last element

Time Complexity: O(n)
Space Complexity: O(n)
*/

class Solution {
    public List<Integer> getRow(int rowIndex) {
        
        if(rowIndex==0) return new ArrayList<>(Arrays.asList(1));

        int r = rowIndex+1;
        List<Integer> list = new ArrayList<>();
        long res = 1;
        list.add(1);
        for(int i=1;i<r-1;i++){
            res*=r-i;
            res/=i;
            list.add((int)res);
        }
        list.add(1);
        return list;

    }
}
