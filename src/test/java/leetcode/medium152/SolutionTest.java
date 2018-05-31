package leetcode.medium152;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by NAVER on 2018-05-31.
 */
public class SolutionTest {
    @Test
    public void maxProduct() {
        Solution solution = new Solution();
        int[] nums = {2,3,-2,4};
        assertEquals(6, solution.maxProduct(nums));

        nums = new int[]{-2,0,-1};
        assertEquals(0, solution.maxProduct(nums));

    }
}