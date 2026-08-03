/*
Problem 80: Remove Duplicates from Sorted Array II

Approach: (Brute Force)
1. Store the frequency of each element using a LinkedHashMap.
2. LinkedHashMap preserves insertion order, which matches the sorted order of the array.
3. Write each element back into the array at most twice.
4. Return the new length of the modified array.

Time Complexity: O(n)
Space Complexity: O(n)
*/

class Solution {
    public int removeDuplicates(int[] nums) {

        LinkedHashMap<Integer,Integer> map = new LinkedHashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        int i=0;
        for(Map.Entry<Integer,Integer>entry: map.entrySet()){
            if(entry.getValue()>=2){
                nums[i++]=entry.getKey();
                nums[i++]=entry.getKey();
            }else{
                nums[i++]=entry.getKey();
            }
        }
        return i;

    }
}
