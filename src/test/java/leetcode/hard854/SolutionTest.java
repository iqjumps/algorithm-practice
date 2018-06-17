package leetcode.hard854;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void test() {
        Solution solution = new Solution();
        assertEquals(1, solution.kSimilarity("ab", "ba"));
        assertEquals(2, solution.kSimilarity("abc", "bca"));
        assertEquals(2, solution.kSimilarity("abac", "baca"));
        assertEquals(2, solution.kSimilarity("aabc", "abca"));
        assertEquals(5, solution.kSimilarity("aabbccddee", "dcacbedbae"));
        assertEquals(9, solution.kSimilarity("abccaacceecdeea", "bcaacceeccdeaae"));
    }
}