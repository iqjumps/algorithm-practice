package leetcode.easy849;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void maxDistToClosest() {
        Solution solution = new Solution();
        assertEquals(2, solution.maxDistToClosest(new int[]{1,0,0,0,1,0,1}));
        assertEquals(3, solution.maxDistToClosest(new int[]{1,0,0,0}));
        assertEquals(1, solution.maxDistToClosest(new int[]{0,1}));
    }
}