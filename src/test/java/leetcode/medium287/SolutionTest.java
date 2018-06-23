package leetcode.medium287;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {
    @Test
    public void findDuplicate() throws Exception {
        Solution solution = new Solution();
        assertEquals(2, solution.findDuplicate(new int[]{1,3,4,2,2}));
        assertEquals(3, solution.findDuplicate(new int[]{3,1,3,4,2}));
        assertEquals(2, solution.findDuplicate(new int[]{2,2,2,2,2}));
        assertEquals(1, solution.findDuplicate(new int[]{1,3,4,2,1}));
    }

}