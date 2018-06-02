package leetcode.medium322;

import java.util.Arrays;

/**
 * 322. Coin Change
 * https://leetcode.com/problems/coin-change/description/
 */
class Solution {
    public int coinChange(int[] coins, int amount) {
        Arrays.sort(coins);

        int[] cache = new int[amount+1];
        int result = solve(coins, cache, amount);
        return (result >= 999999 ) ? -1 : result;
    }

    public int solve(int[] coins, int[] cache, int amount) {
        int min = 999999;
        if (amount == 0) {
            return 0;
        }
        if (amount < coins[0]) {
            return min;
        }
        if (cache[amount] != 0) {
            return cache[amount];
        }

        for (int i=coins.length-1; i>=0; i--) {
            int cur = coins[i];
            if (amount%cur == 0) {
                min = Math.min(min, amount/cur);
                cache[amount] = min;
                return min;
            }
            if (amount > cur) {
                min = Math.min(min, 1 + solve(coins, cache, amount - cur));
            }
        }
        cache[amount] = min;
        return min;
    }
}
