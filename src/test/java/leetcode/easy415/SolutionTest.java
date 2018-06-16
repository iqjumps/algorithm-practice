package leetcode.easy415;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {
    @Test
    public void addStrings() throws Exception {
        Solution solution = new Solution();
        assertEquals(135791 + 876123 + "", solution.addStrings(135791+"", 876123+""));
        assertEquals(123456 + 789 + "", solution.addStrings(123456+"", 789+""));
    }

}