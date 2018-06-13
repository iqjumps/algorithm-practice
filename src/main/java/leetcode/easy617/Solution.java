package leetcode.easy617;

/**
 * 617. Merge Two Binary Trees
 * https://leetcode.com/problems/merge-two-binary-trees/description/
 */
class Solution {
    public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
        if (t1 == null && t2 == null) {
            return null;
        }
        TreeNode merged = new TreeNode(((t1 == null) ? 0 : t1.val) + ((t2 == null) ? 0 : t2.val));
        merged.left = mergeTrees(t1 == null ? null : t1.left, t2 == null ? null : t2.left);
        merged.right = mergeTrees(t1 == null ? null : t1.right, t2 == null ? null : t2.right);
        return merged;
    }

    /**
     * Definition for a binary tree node.
     * public class TreeNode {
     * int val;
     * TreeNode left;
     * TreeNode right;
     * TreeNode(int x) { val = x; }
     * }
     */
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }
}
