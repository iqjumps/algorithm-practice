package leetcode.medium611;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {
    @Test
    public void triangleNumber() throws Exception {
        Solution solution = new Solution();
        assertEquals(3, solution.triangleNumber(new int[]{2, 2, 3, 4}));
        assertEquals(0, solution.triangleNumber(new int[]{0, 1, 0, 1}));

    }

}