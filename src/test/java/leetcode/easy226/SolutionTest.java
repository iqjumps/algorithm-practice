package leetcode.easy226;

import org.junit.Test;

import static leetcode.easy226.Solution.*;
import static org.junit.Assert.*;

public class SolutionTest {
    @Test
    public void invertTree() throws Exception {
        Solution solution = new Solution();
        TreeNode node4 = new TreeNode(4);
        TreeNode node2 = new TreeNode(2);
        TreeNode node7 = new TreeNode(7);
        TreeNode node1 = new TreeNode(1);
        TreeNode node3 = new TreeNode(3);
        TreeNode node6 = new TreeNode(6);
        TreeNode node9 = new TreeNode(9);

        node4.left = node2;
        node4.right = node7;
        node2.left = node1;
        node2.right = node3;
        node7.left = node6;
        node7.right = node9;

        TreeNode root = solution.invertTree(node4);
        assertEquals(node4, root);
        assertEquals(node7, node4.left);
        assertEquals(node2, node4.right);
        assertEquals(node9, node7.left);
        assertEquals(node6, node7.right);
        assertEquals(node3, node2.left);
        assertEquals(node1, node2.right);

    }

}