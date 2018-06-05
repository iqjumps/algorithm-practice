package leetcode.easy581;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by NAVER on 2018-06-05.
 */
public class SolutionTest {
    @Test
    public void findUnsortedSubarray() throws Exception {
        Solution solution = new Solution();
        assertEquals(5, solution.findUnsortedSubarray(new int[]{2, 6, 4, 8, 10, 9, 15}));
        assertEquals(4, solution.findUnsortedSubarray(new int[]{1, 3, 2, 2, 2}));
    }

}