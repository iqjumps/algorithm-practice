package leetcode.medium238;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {
    @Test
    public void productExceptSelf() throws Exception {
        Solution solution = new Solution();
        assertArrayEquals(new int[]{24,12,8,6}, solution.productExceptSelf(new int[]{1,2,3,4}));
    }

}