package leetcode.easy1;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {
    @Test
    public void twoSum() throws Exception {
        Solution solution = new Solution();
        assertArrayEquals(new int[]{0,1}, solution.twoSum(new int[]{2, 7, 11, 15}, 9));
        assertArrayEquals(new int[]{1,2}, solution.twoSum(new int[]{3,2,4}, 6));
    }

}