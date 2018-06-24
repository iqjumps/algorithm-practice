package leetcode.easy448;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class SolutionTest {
    @Test
    public void findDisappearedNumbers() throws Exception {
        Solution solution = new Solution();
        assertArrayEquals(Arrays.asList(5,6).toArray(), solution.findDisappearedNumbers(new int[]{4,3,2,7,8,2,3,1}).toArray());
    }

}