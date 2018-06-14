package leetcode.hard128;

import java.util.*;

/**
 * 128. Longest Consecutive Sequence
 * https://leetcode.com/problems/longest-consecutive-sequence/description/
 */
class Solution {

    Map<Integer, Integer> map = new HashMap<>();
    Integer left = null;
    Integer right = null;

    public int longestConsecutive(int[] nums) {
        if (nums.length <= 1) {
            return nums.length;
        }
        int max = 1, num;
        map.clear();
        map.put(nums[0], nums[0]);
        for (int i = 1; i < nums.length; i++) {
            num = nums[i];
            if (map.containsKey(num)) {
                continue;
            }
            left = map.get(num-1);
            right = map.get(num+1);
            if (left != null && right != null) {
                map.put(num, num);
                map.put(left, right);
                map.put(right, left);
                max = Math.max(max, right-left+1);
            } else if (left != null) {
                map.put(num, num);
                map.put(left, num);
                map.put(num, left);
                max = Math.max(max, num-left+1);
            } else if (right != null) {
                map.put(num, num);
                map.put(right, num);
                map.put(num, right);
                max = Math.max(max, right-num+1);
            } else {
                map.put(num, num);
            }
        }
        return max;
    }
}
