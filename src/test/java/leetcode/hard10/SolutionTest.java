package leetcode.hard10;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {
    @Test
    public void isMatch() throws Exception {
        Solution solution = new Solution();
        assertEquals(false, solution.isMatch("aa", "a"));
        assertEquals(true, solution.isMatch("aa", "a*"));
        assertEquals(true, solution.isMatch("ab", ".*"));
        assertEquals(true, solution.isMatch("aab", "c*a*b"));
        assertEquals(false, solution.isMatch("mississippi", "mis*is*p*."));
        assertEquals(false, solution.isMatch("aaa", "aaaa"));
        assertEquals(false, solution.isMatch("aaa", "ab*a"));
    }

}