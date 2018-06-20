package leetcode.easy226;

/**
 * 226. Invert Binary Tree
 * https://leetcode.com/problems/invert-binary-tree/description/
 */
class Solution {
    public TreeNode invertTree(TreeNode root) {
        invert(root);
        return root;
    }
    public void invert(TreeNode node) {
        if (node == null) {
            return;
        }
        invert(node.left);
        invert(node.right);
        TreeNode tmp = node.left;
        node.left = node.right;
        node.right = tmp;
    }

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
}
