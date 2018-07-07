package leetcode.easy121;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {
    @Test
    public void maxProfit() throws Exception {
        Solution solution = new Solution();
        assertEquals(5, solution.maxProfit(new int[]{7,1,5,3,6,4}));
        assertEquals(0, solution.maxProfit(new int[]{7,6,4,3,1}));
    }

}