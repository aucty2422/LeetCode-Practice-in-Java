/*
Problem: 4Sum

Approach:
1. Sort the array
2. Fix the first two elements
3. Find the other pair using two pointers
4. Skip duplicates to ensure unique quadruplet

Time Complexity: O(n^3)
Space Complexity: O(log n) due to recursion stack
*/

class Solution {
    public List<List<Integer>> fourSum(int[] arr, int goal) {
        
        Arrays.sort(arr);

        List<List<Integer>> ans = new ArrayList<>();

        for(int m=0;m<arr.length-3;m++){

            if(m>0 && arr[m]==arr[m-1]) continue;

            for(int n=m+1;n<arr.length-2;n++){

                if(n>m+1 && arr[n]==arr[n-1]) continue;

                long target= (long) goal - arr[m]- arr[n];

                int i=n+1;
                int j = arr.length-1;

                while(i<j){
                    long sum = (long) arr[i]+arr[j];

                    if(sum<target) i++;

                    else if(sum>target) j--;

                    else{
                        List<Integer> quad = new ArrayList<>(Arrays.asList(arr[m],arr[n],arr[i],arr[j]));
                        ans.add(quad);

                        while(i<j && arr[i]==arr[i+1]) i++;
                        while(i<j && arr[j]==arr[j-1]) j--;

                        i++;
                        j--;
                    }

                } 
            }
        }
        return ans;

    }
}
