package leetcode.hard84;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by NAVER on 2018-06-21.
 */
public class SolutionTest {
    @Test
    public void largestRectangleArea() throws Exception {
        Solution solution = new Solution();
        assertEquals(2, solution.largestRectangleArea(new int[]{1,1}));
        assertEquals(10, solution.largestRectangleArea(new int[]{2,1,5,6,2,3}));
    }

}