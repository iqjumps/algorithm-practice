package leetcode.medium75;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void sortColors() {
        Solution solution = new Solution();
        int[] arr = new int[]{2,0,2,1,1,0};
        solution.sortColors(arr);
        assertArrayEquals(new int[]{0,0,1,1,2,2}, arr);
    }
}