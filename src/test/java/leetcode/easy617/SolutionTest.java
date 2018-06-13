package leetcode.easy617;

import org.junit.Test;

import static leetcode.easy617.Solution.*;
import static org.junit.Assert.*;

public class SolutionTest {
    @Test
    public void mergeTrees() throws Exception {
        TreeNode a1 = new TreeNode(1);
        TreeNode a2 = new TreeNode(2);
        TreeNode a3 = new TreeNode(3);
        TreeNode a5 = new TreeNode(5);
        a1.left = a3;
        a1.right = a2;
        a3.left = a5;

        TreeNode b1 = new TreeNode(1);
        TreeNode b2 = new TreeNode(2);
        TreeNode b3 = new TreeNode(3);
        TreeNode b4 = new TreeNode(4);
        TreeNode b7 = new TreeNode(7);
        b2.left = b1;
        b2.right = b3;
        b1.right = b4;
        b3.right = b7;

        Solution solution = new Solution();
        TreeNode c = solution.mergeTrees(a1, b2);
        assertEquals(3, c.val);
        assertEquals(4, c.left.val);
        assertEquals(5, c.right.val);
        assertEquals(5, c.left.left.val);
        assertEquals(4, c.left.right.val);
        assertEquals(7, c.right.right.val);

    }

}