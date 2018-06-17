package leetcode.medium853;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {
    @Test
    public void test() {
        Solution solution = new Solution();
        assertEquals(3, solution.carFleet(12, new int[]{10,8,0,5,3}, new int[]{2,4,1,1,3}));

    }
}