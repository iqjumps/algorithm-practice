package leetcode.easy283;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {
    @Test
    public void moveZeroes() throws Exception {
        Solution solution = new Solution();
        int[] nums = {0,1,0,3,12};
        solution.moveZeroes(nums);
        assertArrayEquals(new int[]{1,3,12,0,0}, nums);

        nums = new int[]{0, 0, 1, 2, 3};
        solution.moveZeroes(nums);
        assertArrayEquals(new int[]{1,2,3,0,0}, nums);
    }

}