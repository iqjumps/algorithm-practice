package leetcode.easy844;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {
    @Test
    public void backspaceCompare() throws Exception {
        Solution solution = new Solution();
        assertEquals(true, solution.backspaceCompare("ab#c", "ad#c"));
        assertEquals(true, solution.backspaceCompare("ab##", "c#d#"));
        assertEquals(true, solution.backspaceCompare("a##c", "#a#c"));
        assertEquals(false, solution.backspaceCompare("a#c", "b"));
    }

}