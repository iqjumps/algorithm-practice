package leetcode.easy53;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {
    @Test
    public void maxSubArray() throws Exception {
        Solution solution = new Solution();
        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
        assertEquals(6, solution.maxSubArray(nums));
    }

}