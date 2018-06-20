package leetcode.medium22;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class SolutionTest {
    @Test
    public void generateParenthesis() throws Exception {
        Solution solution = new Solution();
        List<String> strings = solution.generateParenthesis(3);
        assertEquals(5, strings.size());
        assertEquals(true, strings.contains("((()))"));
        assertEquals(true, strings.contains("(()())"));
        assertEquals(true, strings.contains("(())()"));
        assertEquals(true, strings.contains("()(())"));
        assertEquals(true, strings.contains("()()()"));
    }

}