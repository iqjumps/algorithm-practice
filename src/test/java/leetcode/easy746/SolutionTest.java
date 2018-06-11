package leetcode.easy746;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {
    @Test
    public void minCostClimbingStairs() throws Exception {
        Solution solution = new Solution();
        assertEquals(15, solution.minCostClimbingStairs(new int[]{10, 15, 20}));
        assertEquals(6, solution.minCostClimbingStairs(new int[]{1, 100, 1, 1, 1, 100, 1, 1, 100, 1}));
    }

}