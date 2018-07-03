package leetcode.easy538;

/**
 * 538. Convert BST to Greater Tree
 * https://leetcode.com/problems/convert-bst-to-greater-tree/description/
 */
class Solution {
    public TreeNode convertBST(TreeNode root) {
        if (root == null) {
            return null;
        }
        search(root, 0);
        return root;
    }

    public int search(TreeNode node, int sum) {
        int rsum = node.right != null ? search(node.right, sum) : 0;
        node.val += sum + rsum;
        int lsum = node.left != null ? search(node.left, node.val) : 0;
        return lsum + node.val - sum;
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
