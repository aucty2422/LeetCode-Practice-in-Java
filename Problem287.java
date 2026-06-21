// 287. Find the Duplicate Number

// Approach (HashMap)

// 1.Create a HashMap and store each number and its frequency
// 2. Traverse the array and update the frequency of each element
// 3. If frequency becomes 2, return the element since it is duplicate

class Solution {
    public int findDuplicate(int[] arr) {
      
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i =0;i<arr.length;i++){
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
            int count = map.get(arr[i]);
            if(count==2) return arr[i];
        }
        return -1;

        
    }
}

// Time Complexity: O(n)     
// Space Complexity: O(n)    


