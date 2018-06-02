package leetcode.easy804;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by NAVER on 2018-05-26.
 */
public class SolutionTest {
    @Test
    public void uniqueMorseRepresentations() throws Exception {
        Solution solution = new Solution();
        String[] words = {"gin", "zen", "gig", "msg"};
        assertEquals(2, solution.uniqueMorseRepresentations(words));
    }

}