package leetcode.medium468;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {
    @Test
    public void validIPAddress() throws Exception {
        Solution solution = new Solution();
        assertEquals("IPv4", solution.validIPAddress("172.16.254.1"));
        assertEquals("Neither", solution.validIPAddress("1.1.1.1."));
        assertEquals("Neither", solution.validIPAddress("256.256.256.256"));
        assertEquals("IPv6", solution.validIPAddress("2001:0db8:85a3:0:0:8A2E:0370:7334"));
    }

}