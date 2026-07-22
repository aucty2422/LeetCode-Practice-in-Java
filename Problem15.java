/*
Problem: 3Sum

Approach:
1. Sort the array.
2. Fix one element arr[l].
3. Use two pointers to find pairs such that arr[i] + arr[j] = -arr[l].
4. Skip duplicates for arr[l], arr[i], and arr[j].

Time Complexity: O(n*n)
Space Complexity: O(1)
*/

class Solution {
    public List<List<Integer>> threeSum(int[] arr) {

        //sort the array
        Arrays.sort(arr);

        //list to store elements
        List<List<Integer>> ans = new ArrayList<>();

        //find triplet without duplicates
        for (int l=0; l<arr.length-2; l++) {
            if (l>0 && arr[l]==arr[l-1])
                continue;
            int target = -(arr[l]);
            int i = l+1;
            int j = arr.length-1;
            while (i<j) {
                int sum = arr[i] + arr[j];
                if (sum>target)
                    j--;
                else if (sum<target)
                    i++;
                else {
                    List<Integer> triplet = new ArrayList<>(Arrays.asList(arr[l], arr[i], arr[j]));
                    ans.add(triplet);
                    while (i<j && arr[i] == arr[i+1]) i++;
                    while (i<j && arr[j] == arr[j-1]) j--;
                    i++;
                    j--;
                }
            }
        }
        return ans;

    }
}
