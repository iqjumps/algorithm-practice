package leetcode.medium647;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {
    @Test
    public void countSubstrings() throws Exception {
        Solution solution = new Solution();
        assertEquals(3, solution.countSubstrings("abc"));
        assertEquals(6, solution.countSubstrings("aaa"));
    }

}