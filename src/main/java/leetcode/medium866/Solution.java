package leetcode.medium866;

import java.util.ArrayList;
import java.util.List;

/**
 * 866. Smallest Subtree with all the Deepest Nodes
 * https://leetcode.com/problems/smallest-subtree-with-all-the-deepest-nodes/description/
 */
class Solution {

    public TreeNode subtreeWithAllDeepest(TreeNode root) {
        if (root == null) {
            return null;
        }
        int depth = getDepth(root);

        List<List<TreeNode>> list = new ArrayList<>();
        TreeNode[] nodes = new TreeNode[depth + 1];

        search(root, nodes, list, depth, 0);

        if (list.size() == 1) {
            return list.get(0).get(depth);
        }

        TreeNode out = root;
        for (int i = 0; i < depth; i++) {
            TreeNode node = list.get(0).get(i);
            boolean isAllSame = true;
            for (int j = 1; j < list.size(); j++) {
                if (list.get(j).get(i) != node) {
                    isAllSame = false;
                    break;
                }
            }
            if (isAllSame) {
                out = node;
            }
        }

        return out;
    }

    public void search(TreeNode node, TreeNode[] nodes, List<List<TreeNode>> list, int depth, int cur) {
        nodes[cur] = node;

        if (depth == cur) {
            List<TreeNode> t = new ArrayList<>();
            for (int i = 0; i < depth + 1; i++) {
                t.add(nodes[i]);
            }
            list.add(t);
            return;
        }
        if (node.left != null) {
            search(node.left, nodes, list, depth, cur + 1);
        }
        if (node.right != null) {
            search(node.right, nodes, list, depth, cur + 1);
        }
    }

    public int getDepth(TreeNode node) {
        if (node == null) {
            return 0;
        }
        int depth = 0;
        if (node.left != null) {
            depth = Integer.max(depth, 1 + getDepth(node.left));
        }
        if (node.right != null) {
            depth = Integer.max(depth, 1 + getDepth(node.right));
        }

        return depth;
    }

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }

        @Override
        public String toString() {
            return "TreeNode(" + val + ")";
        }
    }
}
