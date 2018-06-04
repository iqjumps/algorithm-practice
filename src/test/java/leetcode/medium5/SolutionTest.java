package leetcode.medium5;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {
    @Test
    public void maxProduct() {
        Solution solution = new Solution();
        assertEquals("aba", solution.longestPalindrome("babad"));
        //assertEquals("bab", solution.longestPalindrome("babad"));
        assertEquals("bb", solution.longestPalindrome("cbbd"));
        assertEquals("a", solution.longestPalindrome("abcda"));
    }
}