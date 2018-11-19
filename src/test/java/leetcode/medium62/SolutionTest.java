package leetcode.medium62;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void uniquePaths() {
        Solution solution = new Solution();
        assertEquals(3, solution.uniquePaths(3,2));
        assertEquals(28, solution.uniquePaths(7,3));
    }
}