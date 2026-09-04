/*
Problem 152: Maximum Product Subarray

Approach: 
1. Use prefix and suffix products to keep track of the product from both ends
2. Reset the product to 1 whenever it becomes 0, since a zero breaks the subarray
3. Calculate the prefix product from the left and the suffix product from the right
4. At each step, take the maximum of the current prefix and suffix products
5. Keep updating the overall maximum product found so far

Time Complexity: O(n)
Space Complexity:O(1)

*/
class Solution {
    public int maxProduct(int[] arr) {
        
       int pre = 1;
       int suff = 1;
       int i = 0;
       int j = arr.length-1;
       int maxPr = Integer.MIN_VALUE;
       while(i<arr.length && j>=0){
        if(pre==0) pre=1;
        if(suff==0) suff=1;
        pre*=arr[i];
        suff*=arr[j];
        maxPr = Math.max(maxPr, Math.max(pre,suff));
        i++;
        j--;
       }

       return maxPr;


    }
}
