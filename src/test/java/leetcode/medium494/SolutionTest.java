package leetcode.medium494;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {
    @Test
    public void findTargetSumWays() throws Exception {
        Solution solution = new Solution();
        assertEquals(5, solution.findTargetSumWays(new int[]{1,1,1,1,1}, 3));
        assertEquals(2, solution.findTargetSumWays(new int[]{1,0}, 1));
    }

}