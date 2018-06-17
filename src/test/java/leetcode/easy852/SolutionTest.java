package leetcode.easy852;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {
    @Test
    public void test() {
        Solution solution = new Solution();
        assertEquals(1, solution.peakIndexInMountainArray(new int[]{0,1,0}));
        assertEquals(1, solution.peakIndexInMountainArray(new int[]{0,2,1,0}));
    }
}