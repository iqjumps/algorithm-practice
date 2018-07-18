package leetcode.hard32;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {
    @Test
    public void longestValidParentheses() throws Exception {
        Solution solution = new Solution();
        assertEquals(2, solution.longestValidParentheses("()(()"));
        assertEquals(2, solution.longestValidParentheses("(()"));
        assertEquals(4, solution.longestValidParentheses(")()())"));
        assertEquals(8, solution.longestValidParentheses(")((())())"));
    }

}