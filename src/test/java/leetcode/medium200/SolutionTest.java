package leetcode.medium200;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void numIslands() {
        char[][] arr = new char[][]{{'1','1','1','1','0'}, {'1','1','0','1','0'},
                {'1','1','0','0','0'},{'0','0','0','0','0'}};
        Solution solution = new Solution();
        assertEquals(1, solution.numIslands(arr));
    }
}