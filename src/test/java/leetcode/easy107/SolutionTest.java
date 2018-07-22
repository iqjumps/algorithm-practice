package leetcode.easy107;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static leetcode.easy107.Solution.*;
import static org.junit.Assert.*;

public class SolutionTest {
    @Test
    public void levelOrderBottom() throws Exception {
        TreeNode node1 = new TreeNode(3);
        TreeNode node2 = new TreeNode(9);
        TreeNode node3 = new TreeNode(20);
        TreeNode node4 = new TreeNode(15);
        TreeNode node5 = new TreeNode(7);

        node1.left = node2;
        node1.right = node3;
        node3.left = node4;
        node3.right = node5;

        Solution solution = new Solution();
        List<List<Integer>> listList = solution.levelOrderBottom(node1);
        assertArrayEquals(Arrays.asList(15, 7).toArray(), listList.get(0).toArray());
        assertArrayEquals(Arrays.asList(9, 20).toArray(), listList.get(1).toArray());
        assertArrayEquals(Arrays.asList(3).toArray(), listList.get(2).toArray());
    }

}