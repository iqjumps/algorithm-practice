package leetcode.medium322;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {
    @Test
    public void coinChange() {
        Solution solution = new Solution();
        int[] coins = {1,2,5};
        assertEquals(3, solution.coinChange(coins, 11));

        coins = new int[]{2};
        assertEquals(-1, solution.coinChange(coins, 3));

        coins = new int[]{186,419,83,408};
        assertEquals(20, solution.coinChange(coins, 6249));
    }
}