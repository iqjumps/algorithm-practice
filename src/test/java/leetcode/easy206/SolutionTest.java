package leetcode.easy206;

import org.junit.Test;

import static leetcode.easy206.Solution.*;
import static org.junit.Assert.*;

public class SolutionTest {
    @Test
    public void reverseList() throws Exception {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);
        ListNode node5 = new ListNode(5);

        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;

        ListNode out = new Solution().reverseList(node1);
        assertEquals(5, out.val);
        assertEquals(4, out.next.val);
        assertEquals(3, out.next.next.val);
        assertEquals(2, out.next.next.next.val);
        assertEquals(1, out.next.next.next.next.val);
    }

}