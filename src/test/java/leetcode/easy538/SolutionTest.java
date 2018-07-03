package leetcode.easy538;

import org.junit.Test;

import static leetcode.easy538.Solution.TreeNode;
import static org.junit.Assert.assertEquals;

public class SolutionTest {
    @Test
    public void convertBST() throws Exception {
        TreeNode node1 = new TreeNode(5);
        TreeNode node2 = new TreeNode(2);
        TreeNode node3 = new TreeNode(13);
        node1.left = node2;
        node1.right = node3;

        Solution solution = new Solution();
        TreeNode out = solution.convertBST(node1);
        assertEquals(18, out.val);
        assertEquals(20, out.left.val);
        assertEquals(13, out.right.val);

        node1 = new TreeNode(2);
        node2 = new TreeNode(0);
        node3 = new TreeNode(3);
        TreeNode node4 = new TreeNode(-4);
        TreeNode node5 = new TreeNode(1);

        node1.left = node2;
        node1.right = node3;
        node2.left = node4;
        node2.right = node5;

        TreeNode out2 = solution.convertBST(node1);
        assertEquals(5, out2.val);
        assertEquals(6, out2.left.val);
        assertEquals(3, out2.right.val);
        assertEquals(2, out2.left.left.val);
        assertEquals(6, out2.left.right.val);

        node1 = new TreeNode(0);
        node2 = new TreeNode(-1);
        node3 = new TreeNode(2);
        node4 = new TreeNode(-3);
        node5 = new TreeNode(4);

        node1.left = node2;
        node1.right = node3;
        node2.left = node4;
        node3.right = node5;
        TreeNode out3 = solution.convertBST(node1);
        assertEquals(6, out3.val);
        assertEquals(5, out3.left.val);
        assertEquals(6, out3.right.val);
        assertEquals(2, out3.left.left.val);
        assertEquals(4, out3.right.right.val);

    }

}