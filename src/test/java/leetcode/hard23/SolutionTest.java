package leetcode.hard23;

import org.junit.Test;

import static leetcode.hard23.Solution.*;
import static org.junit.Assert.*;

public class SolutionTest {
    @Test
    public void mergeKLists() throws Exception {
        Solution solution = new Solution();

        ListNode[] lists = new ListNode[3];
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(4);
        ListNode node3 = new ListNode(5);
        node1.next = node2;
        node2.next = node3;
        lists[0] = node1;

        node1 = new ListNode(1);
        node2 = new ListNode(3);
        node3 = new ListNode(4);
        node1.next = node2;
        node2.next = node3;
        lists[1] = node1;

        node1 = new ListNode(2);
        node2 = new ListNode(6);
        node1.next = node2;
        lists[2] = node1;

        ListNode node;
        assertEquals(1, (node = solution.mergeKLists(lists)).val);
        assertEquals(1, (node = node.next).val);
        assertEquals(2, (node = node.next).val);
        assertEquals(3, (node = node.next).val);
        assertEquals(4, (node = node.next).val);
        assertEquals(4, (node = node.next).val);
        assertEquals(5, (node = node.next).val);
        assertEquals(6, (node = node.next).val);

//        assertEquals(null, solution.mergeKLists(null));
        assertEquals(null, solution.mergeKLists(new ListNode[]{null}));


    }

}