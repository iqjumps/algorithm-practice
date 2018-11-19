package leetcode.hard124;

/**
 * 124. Binary Tree Maximum Path Sum
 * https://leetcode.com/problems/binary-tree-maximum-path-sum/
 */
class Solution {

    public int maxPathSum(TreeNode root) {
        int[] max = new int[2];
        max[1] = root.val;
        getMax(root, max);
        if (max[1] < 0) {
            return max[1];
        }
        return max[0];
    }

    public int getMax(TreeNode node, int[] max) { // max[0]=maxSum, max[1]=maxVal
        if (node == null) {
            return 0;
        }
        max[1] = Integer.max(max[1], node.val);
        int left = getMax(node.left, max);
        int right = getMax(node.right, max);
        int result = Integer.max(node.val, Integer.max(left, right) + node.val);
        max[0] = Integer.max(max[0], result); // left or right or 연결 안했을 시
        max[0] = Integer.max(max[0], left + right + node.val); // left, right 다 연결 시

        return result;
    }
}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }
}