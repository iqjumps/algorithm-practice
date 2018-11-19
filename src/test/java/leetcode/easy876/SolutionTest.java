package leetcode.easy876;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void middleNode() {
        Solution solution = new Solution();
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);
        ListNode node5 = new ListNode(5);
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;

        assertEquals(node3, solution.middleNode(node1));
    }
}