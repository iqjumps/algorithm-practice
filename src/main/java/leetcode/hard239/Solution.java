package leetcode.hard239;

import java.util.Collections;
import java.util.PriorityQueue;

/**
 * 239. Sliding Window Maximum
 * https://leetcode.com/problems/sliding-window-maximum/
 */
class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int length = nums.length;
        if (length == 0) {
            return new int[0];
        }
        int[] max = new int[length - k + 1];
        PriorityQueue<Integer> q = new PriorityQueue<>(nums.length, Collections.reverseOrder());
        for (int i = 0; i < k; i++) {
            q.add(nums[i]);
        }
        max[0] = q.peek();
        for (int i = k; i < length; i++) {
            q.remove(nums[i - k]);
            q.add(nums[i]);
            max[i - k + 1] = q.peek();
        }
        return max;
    }
}