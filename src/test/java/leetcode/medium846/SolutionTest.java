package leetcode.medium846;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {
    @Test
    public void isNStraightHand() throws Exception {
        Solution solution = new Solution();
        assertEquals(true, solution.isNStraightHand(new int[]{1,2,3,6,2,3,4,7,8}, 3));
        assertEquals(false, solution.isNStraightHand(new int[]{1,2,3,4,5}, 4));
        assertEquals(false, solution.isNStraightHand(new int[]{5,1}, 2));

    }

}