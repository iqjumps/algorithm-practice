package leetcode.hard23;

import java.util.PriorityQueue;

/**
 * 23. Merge k Sorted Lists
 * https://leetcode.com/problems/merge-k-sorted-lists/description/
 */
class Solution {

    public ListNode mergeKLists(ListNode[] lists) {
        if (lists == null || lists.length == 0) {
            return null;
        }
        PriorityQueue<Integer> q = new PriorityQueue<>();
        for (ListNode node : lists) {
            if (node == null) {
                continue;
            }
            q.add(node.val);
            while ((node = node.next) != null) {
                q.add(node.val);
            }
        }
        if (q.isEmpty()) {
            return null;
        }
        ListNode node = new ListNode(q.poll());
        ListNode temp = node;
        while (!q.isEmpty()) {
            temp.next = new ListNode(q.poll());
            temp = temp.next;
        }
        return node;
    }


    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

}
