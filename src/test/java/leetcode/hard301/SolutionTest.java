package leetcode.hard301;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class SolutionTest {
    @Test
    public void removeInvalidParentheses() throws Exception {
        Solution solution = new Solution();
        List<String> answer = solution.removeInvalidParentheses("()())()");
        assertTrue(answer.contains("()()()"));
        assertTrue(answer.contains("(())()"));

        answer = solution.removeInvalidParentheses("(a)())()");
        assertTrue(answer.contains("(a)()()"));
        assertTrue(answer.contains("(a())()"));

        answer = solution.removeInvalidParentheses(")(");
        assertTrue(answer.contains(""));

    }

}