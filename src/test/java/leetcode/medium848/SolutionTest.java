package leetcode.medium848;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void isNStraightHand() {
        Solution solution = new Solution();
        assertEquals("rpl", solution.shiftingLetters("abc", new int[]{3,5,9}));
        assertEquals("wqqwlcjnkphhsyvrkdod", solution.shiftingLetters("mkgfzkkuxownxvfvxasy",
        new int[]{505870226,437526072,266740649,224336793,532917782,311122363,567754492,595798950,81520022,684110326,137742843,275267355,856903962,148291585,919054234,467541837,622939912,116899933,983296461,536563513}));
    }
}