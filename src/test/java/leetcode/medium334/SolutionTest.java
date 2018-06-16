package leetcode.medium334;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {
    @Test
    public void increasingTriplet() throws Exception {
        Solution solution = new Solution();
        assertEquals(true, solution.increasingTriplet(new int[]{1,2,3,4,5}));
        assertEquals(false, solution.increasingTriplet(new int[]{5,4,3,2,1}));
        assertEquals(true, solution.increasingTriplet(new int[]{2,1,5,0,4,6}));
    }

}