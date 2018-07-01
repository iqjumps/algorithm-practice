package leetcode.easy169;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by NAVER on 2018-07-01.
 */
public class SolutionTest {
    @Test
    public void majorityElement() throws Exception {
        Solution solution = new Solution();
        assertEquals(3, solution.majorityElement(new int[]{3,2,3}));
        assertEquals(2, solution.majorityElement(new int[]{2,2,1,1,1,2,2}));
    }

}