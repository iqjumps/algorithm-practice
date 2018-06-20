package leetcode.hard23;

import java.util.PriorityQueue;

/**
 * 23. Merge k Sorted Lists
 * https://leetcode.com/problems/merge-k-sorted-lists/description/
 */
class Solution {

    PriorityQueue<Integer> q = new PriorityQueue<>();

    public ListNode mergeKLists(ListNode[] lists) {
        if (lists == null || lists.length == 0) {
            return null;
        }
        for (ListNode node : lists) {
            traverse(node);
        }
        int size = q.size();
        if (size == 0) {
            return null;
        }
        ListNode node = new ListNode(q.poll());
        ListNode temp = node;
        for (int i=1; i<size; i++) {
            temp.next = new ListNode(q.poll());
            temp = temp.next;
        }
        return node;
    }
    public void traverse(ListNode node) {
        if (node == null) {
            return;
        }
        traverse(node.next);
        q.add(node.val);
    }

    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

}
