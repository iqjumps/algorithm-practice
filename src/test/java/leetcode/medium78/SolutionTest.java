package leetcode.medium78;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class SolutionTest {
    @Test
    public void subsets() throws Exception {
        Solution solution = new Solution();
        List<List<Integer>> lists = solution.subsets(new int[]{1,2,3});
        assertTrue(lists.contains(Arrays.asList(1)));
        assertTrue(lists.contains(Arrays.asList(2)));
        assertTrue(lists.contains(Arrays.asList(3)));
        assertTrue(lists.contains(Arrays.asList(1,2)));
        assertTrue(lists.contains(Arrays.asList(1,3)));
        assertTrue(lists.contains(Arrays.asList(2,3)));
        assertTrue(lists.contains(Arrays.asList(1,2,3)));
        assertTrue(lists.contains(Arrays.asList()));
    }

}