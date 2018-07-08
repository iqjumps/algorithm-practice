package leetcode.easy868;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void transpose() {
        Solution solution = new Solution();
        int[][] A = {{1, 2, 3,}, {4, 5, 6}, {7, 8, 9}};
        int[][] B = {{1, 4, 7,}, {2, 5, 8}, {3, 6, 9}};
        int[][] C = solution.transpose(A);
        assertArrayEquals(B, C);

        int[][] A2 = {{1,2,3}, {4,5,6}};
        int[][] B2 = {{1,4}, {2,5}, {3,6}};
        int[][] C2 = solution.transpose(A2);
        assertArrayEquals(B2, C2);

        return;
    }
}