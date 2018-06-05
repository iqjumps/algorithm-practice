package leetcode.easy581;

import java.util.Arrays;

/**
 * 581. Shortest Unsorted Continuous Subarray
 * https://leetcode.com/problems/shortest-unsorted-continuous-subarray/description/
 */
class Solution {
    public int findUnsortedSubarray(int[] nums) {
        int length = nums.length;
        if (length == 1) {
            return 0;
        }
        int[] sorted = nums.clone();
        Arrays.sort(sorted);

        int start = -1;
        for (int i = 0; i < length; i++) {
            if (nums[i] != sorted[i]) {
                start = i;
                break;
            }
        }
        int end = -1;
        for (int i = length - 1; i >= 0; i--) {
            if (nums[i] != sorted[i]) {
                end = i;
                break;
            }
        }
        if (start == -1 || end == -1) {
            return 0;
        }
        return end - start + 1;
    }
}