package leetcode.easy121;

/**
 * 121. Best Time to Buy and Sell Stock
 * https://leetcode.com/problems/best-time-to-buy-and-sell-stock/description/
 */
class Solution {
    public int maxProfit(int[] prices) {
        if (prices.length <= 1) {
            return 0;
        }
        int maxProfit = 0;
        int min = prices[0];
        for (int i=1; i<prices.length; i++) {
            maxProfit = Integer.max(maxProfit, prices[i] - min);
            min = Integer.min(min, prices[i]);
        }
        return maxProfit;
    }
}
