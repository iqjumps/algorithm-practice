package leetcode.easy876;

import java.util.ArrayList;
import java.util.List;

/**
 * 876. Middle of the Linked List
 * https://leetcode.com/problems/middle-of-the-linked-list/
 */
class Solution {
    public ListNode middleNode(ListNode head) {
        List<ListNode> nodes = new ArrayList<>();
        while (head != null) {
            nodes.add(head);
            head = head.next;
        }
        return nodes.get(nodes.size()/2);
    }
}

class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}