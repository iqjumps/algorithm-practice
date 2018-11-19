package leetcode.hard297;

/**
 * 297. Serialize and Deserialize Binary Tree
 * https://leetcode.com/problems/serialize-and-deserialize-binary-tree/
 */
public class Codec {

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        if (root == null) {
            return "_#";
        }
        StringBuilder sb = new StringBuilder();
        serialize(root, sb);
        return sb.toString();
    }

    public void serialize(TreeNode node, StringBuilder sb) {
        if (node == null) {
            sb.append("_#");
            return;
        }
        sb.append(node.val).append("#");
        serialize(node.left, sb);
        serialize(node.right, sb);
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        String[] strs = data.split("#");
        return deserialize(strs, new int[1]);
    }

    public TreeNode deserialize(String[] strs, int[] idx) {
        if (idx[0] >= strs.length || "_".equals(strs[idx[0]])) {
            return null;
        }
        TreeNode node = new TreeNode(Integer.parseInt(strs[idx[0]]));
        idx[0]++;
        node.left = deserialize(strs, idx);
        idx[0]++;
        node.right = deserialize(strs, idx);

        return node;
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