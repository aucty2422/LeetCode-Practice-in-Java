/*
Problem 31: Next Permutation

Approach:
1. Find the first index from the right such that arr[i] < arr[i+1]. This is the breakpoint (idx).
2. If no such index exists, the array is in descending order, which means it is the last permutation. Reverse the entire array to get the first permutation.
3. Traverse from the end and find the first element greater than arr[idx]. Swap it with arr[idx].
4. The suffix after idx is in descending order, so reverse it to make it the smallest possible order (ascending), giving the next lexicographical permutation.

Time Complexity: O(n)
Space Complexity: O(1)
*/

class Solution {
    public void reverse(int[] arr, int low, int high){
        int i=low;
        int j = high;
        while(i<j){
            int temp = arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
    }
    public void nextPermutation(int[] arr) {
        
        //1. Find the breaking point
        int idx = -1;
        for(int i=arr.length-2;i>=0;i--){
            if(arr[i]<arr[i+1]){
                idx = i;
                break;
            }
        }

        //if no  breaking point exists, reverse the array
        if(idx==-1){
            reverse(arr,0,arr.length-1);
            return;
        }

        //2. Searching from the last, find the first element greater than arr[idx] and swap it
        for(int i=arr.length-1;i>idx;i--){
            if(arr[i]>arr[idx]){
                int temp = arr[i];
                arr[i]=arr[idx];
                arr[idx]=temp;
                break;
            }
        }

        //3. Reverse the part after idx
        reverse(arr,idx+1,arr.length-1);
        return;


    }
}
