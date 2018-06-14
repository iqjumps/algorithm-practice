package leetcode.medium338;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by NAVER on 2018-06-14.
 */
public class SolutionTest {
    @Test
    public void countBits() throws Exception {
        Solution solution = new Solution();
        assertArrayEquals(new int[]{0,1,1,2,1,2}, solution.countBits(5));
    }

}