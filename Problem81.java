// 81. Search in Rotated Sorted Array II

//Logic - A rotated sorted array has exactly one drop point ( it goes increasing then fall once and again goes increasing)

//Approach
//1. ]Traverse the array and count breaking points
//2. if breaking points > 1 then return false ( since we need only one breaking point)
//3. else check for the target in the array anf return true if fount
//4. else return false



class Solution {
    public boolean search(int[] arr, int target) {
        int r =0;
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]>arr[i+1]) r++;
        }

        if(r>1) return false;
        else{
            for(int i=0;i<arr.length;i++){
                if(arr[i]==target) return true;
            }
        }
        return false;
    }
}

//Time Complexity: O(n)
//Space Complexity: O(1)
