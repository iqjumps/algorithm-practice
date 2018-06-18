package leetcode.medium94;

import leetcode.medium94.Solution.TreeNode;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class SolutionTest {
    @Test
    public void inorderTraversal() throws Exception {
        Solution solution = new Solution();
        TreeNode node1 = new TreeNode(1);
        TreeNode node2 = new TreeNode(2);
        TreeNode node3 = new TreeNode(3);
        node1.right = node2;
        node2.left = node3;
        assertArrayEquals(Arrays.asList(1,3,2).toArray(), solution.inorderTraversal(node1).toArray());
    }

}