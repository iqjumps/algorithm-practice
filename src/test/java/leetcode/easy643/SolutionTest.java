package leetcode.easy643;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by NAVER on 2018-05-27.
 */
public class SolutionTest {
    @Test
    public void findMaxAverage() throws Exception {
        Solution solution = new Solution();
        int[] nums = {1,12,-5,-6,50,3};
        int k = 4;
        assertEquals(12.75, solution.findMaxAverage(nums, k), 0.001);
    }

}