package leetcode.hard128;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {
    @Test
    public void longestConsecutive() throws Exception {
        Solution solution = new Solution();
        assertEquals(4, solution.longestConsecutive(new int[]{100, 4, 200, 1, 3, 2}));
        assertEquals(5, solution.longestConsecutive(new int[]{-2,-3,-3,7,-3,0,5,0,-8,-4,-1,2}));
        assertEquals(14, solution.longestConsecutive(new int[]{-6,6,-9,-7,0,3,4,-2,2,-1,9,-9,5,-3,6,1,5,-1,-2,9,-9,-4,-6,-5,6,-1,3}));
    }

}