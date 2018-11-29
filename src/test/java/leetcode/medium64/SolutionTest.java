package leetcode.medium64;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void minPathSum() {
        int[][] arr = {{1,3,1},{1,5,1},{4,2,1}};
        Solution solution= new Solution();
        assertEquals(7, solution.minPathSum(arr));
    }
}