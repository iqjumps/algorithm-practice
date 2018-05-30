package leetcode.easy258;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by NAVER on 2018-05-26.
 */
public class SolutionTest {
    @Test
    public void addDigits() throws Exception {
        Solution solution = new Solution();
        assertEquals(3, solution.addDigits(3)); // 11
        assertEquals(9, solution.addDigits(18)); // 10010
        assertEquals(2, solution.addDigits(38)); // 11 1000 100110
        assertEquals(6, solution.addDigits(123));
        assertEquals(3, solution.addDigits(1200)); //12 1234 12345 56789
        assertEquals(9, solution.addDigits(567));
        assertEquals(1, solution.addDigits(1234));
    }

}