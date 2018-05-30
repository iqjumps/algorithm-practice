package leetcode.easy541;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by NAVER on 2018-05-26.
 */
public class SolutionTest {
    @Test
    public void reverseStr() throws Exception {
        Solution solution = new Solution();
        assertEquals("bacdfeg", solution.reverseStr("abcdefg", 2));
    }

}