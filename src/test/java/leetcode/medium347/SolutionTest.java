package leetcode.medium347;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertArrayEquals;

public class SolutionTest {
    @Test
    public void topKFrequent() throws Exception {
        Solution solution = new Solution();
        assertArrayEquals(Arrays.asList(1, 2).toArray(), solution.topKFrequent(new int[]{1, 1, 1, 2, 2, 3}, 2).toArray());
    }

}