package leetcode.easy169;

import java.util.Arrays;

/**
 * 169. Majority Element
 * https://leetcode.com/problems/majority-element/description/
 */
class Solution {
    public int majorityElement(int[] nums) {
        int length = nums.length;
        if (length <= 2) {
            return nums[0];
        }
        Arrays.sort(nums);
        return nums[length / 2];
    }
}
