package leetcode.easy136;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by NAVER on 2018-06-18.
 */
public class SolutionTest {
    @Test
    public void singleNumber() {
        Solution solution = new Solution();
        assertEquals(1, solution.singleNumber(new int[]{2,2,1}));
        assertEquals(4, solution.singleNumber(new int[]{4,1,2,1,2}));

    }

}