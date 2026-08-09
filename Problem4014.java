/*
Problem 4014: Minimum Total Price After Applying Discounts

Approach:
1. Sort both prices and discounts in ascending order.
2. Traverse prices from the highest price.
3. If a discount is available, apply the highest remaining discount to the current price.
4. If no discounts are left, add the price without any discount.
5. Since the largest discounts are applied to the largest prices, the total price is minimized.

Time Complexity: O(n log n + m log m)
Space Complexity: O(1)
*/

class Solution {
    public double minPrice(int[] prices, int[] discounts) {

        Arrays.sort(prices);
        Arrays.sort(discounts);

        double sum = 0.00000;
        int j = discounts.length-1;
        for(int i=prices.length-1;i>=0;i--){
            if(j>=0){
                sum+=(prices[i]*(double) (100-discounts[j])/100);
                j--;
            }else{
                sum+=prices[i];
            }
        }
        return sum;
        
        
    }
}
