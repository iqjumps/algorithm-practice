package leetcode.hard297;

import org.junit.Test;

import static org.junit.Assert.*;

public class CodecTest {

    @Test
    public void serialize() {
        Codec codec = new Codec();
        TreeNode node1 = new TreeNode(1);
        TreeNode node2 = new TreeNode(2);
        TreeNode node3 = new TreeNode(3);
        TreeNode node4 = new TreeNode(4);
        TreeNode node5 = new TreeNode(5);
        node1.left = node2;
        node1.right = node3;
        node3.left = node4;
        node3.right = node5;

        String serialize = codec.serialize(node1);
        TreeNode deserialize = codec.deserialize(serialize);
        assertEquals(node1.val, deserialize.val);
        assertEquals(node2.val, deserialize.left.val);
        assertEquals(node3.val, deserialize.right.val);
        assertEquals(node4.val, deserialize.right.left.val);
        assertEquals(node5.val, deserialize.right.right.val);
    }
}