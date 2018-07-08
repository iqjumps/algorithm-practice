package leetcode.medium866;

import org.junit.Assert;
import org.junit.Test;

import static leetcode.medium866.Solution.*;

public class SolutionTest {

    @Test
    public void subtreeWithAllDeepest() {
        TreeNode node1 = new TreeNode(3);
        TreeNode node2 = new TreeNode(5);
        TreeNode node3 = new TreeNode(1);
        TreeNode node4 = new TreeNode(6);
        TreeNode node5 = new TreeNode(2);
        TreeNode node6 = new TreeNode(0);
        TreeNode node7 = new TreeNode(8);
        TreeNode node8 = new TreeNode(7);
        TreeNode node9 = new TreeNode(4);

        node1.left = node2;
        node1.right = node3;
        node2.left = node4;
        node2.right = node5;
        node3.left = node6;
        node3.right = node7;
        node5.left = node8;
        node5.right = node9;

        Solution solution = new Solution();
        TreeNode out = solution.subtreeWithAllDeepest(node1);
        Assert.assertEquals(2, out.val);
    }
}