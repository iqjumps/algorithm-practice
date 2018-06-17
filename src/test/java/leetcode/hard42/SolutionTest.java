package leetcode.hard42;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {
    @Test
    public void trap() throws Exception {
        Solution solution = new Solution();
        for (int i = 0; i < 1000000; i++) {
            assertEquals(6, solution.trap(new int[]{0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1}));
//            assertEquals(1, solution.trap(new int[]{4, 9, 4, 5, 3, 2}));
        }
    }

}