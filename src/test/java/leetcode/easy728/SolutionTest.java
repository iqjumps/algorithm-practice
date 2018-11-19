package leetcode.easy728;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertArrayEquals;

public class SolutionTest {

    @Test
    public void selfDividingNumbers() {
        Solution solution = new Solution();
        assertArrayEquals(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 11, 12, 15, 22).toArray(),
                solution.selfDividingNumbers(1, 22).toArray());
    }
}