package leetcode.medium94;

import java.util.ArrayList;
import java.util.List;

/**
 * 94. Binary Tree Inorder Traversal
 * https://leetcode.com/problems/binary-tree-inorder-traversal/description/
 */
class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        if (root != null) {
            traverse(root, list);
        }
        return list;
    }

    public void traverse(TreeNode node, List<Integer> list) {
        if (node.left != null) {
            traverse(node.left, list);
        }
        list.add(node.val);
        if (node.right != null) {
            traverse(node.right, list);
        }
    }

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }
}
