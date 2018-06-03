package leetcode.medium845;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {
    @Test
    public void longestMountain() throws Exception {
        Solution solution = new Solution();
        assertEquals(5, solution.longestMountain(new int[]{2,1,4,7,3,2,5}));
        assertEquals(0, solution.longestMountain(new int[]{2,2,2}));

    }

}