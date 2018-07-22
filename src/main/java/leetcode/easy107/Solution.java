package leetcode.easy107;

import java.util.*;

/**
 * 107. Binary Tree Level Order Traversal II
 * https://leetcode.com/problems/binary-tree-level-order-traversal-ii/description/
 */
class Solution {
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> lists = new ArrayList<>();
        if (root == null) {
            return lists;
        }

        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        int size = 0;
        while ((size = q.size()) > 0) {
            List<Integer> list = new ArrayList<>(size);
            for (int i=0; i<size; i++) {
                TreeNode node = q.poll();
                list.add(node.val);
                if (node.left != null) {
                    q.add(node.left);
                }
                if (node.right != null) {
                    q.add(node.right);
                }
            }
            lists.add(list);
        }
        Collections.reverse(lists);
        return lists;
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
