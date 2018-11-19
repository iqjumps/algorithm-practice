package leetcode.medium49;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void groupAnagrams() {
        Solution solution = new Solution();
        List<List<String>> lists = solution.groupAnagrams(new String[]{"eat", "tea", "tan", "ate", "nat", "bat"});
        assertTrue(lists.stream().anyMatch(
                strings -> strings.containsAll(Arrays.asList("ate", "eat", "tea"))));
        assertTrue(lists.stream().anyMatch(
                strings -> strings.containsAll(Arrays.asList("nat", "tan"))));
        assertTrue(lists.stream().anyMatch(
                strings -> strings.containsAll(Arrays.asList("bat"))));
    }
}