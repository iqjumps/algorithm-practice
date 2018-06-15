package leetcode.easy283;

/**
 * 283. Move Zeroes
 * https://leetcode.com/problems/move-zeroes/description/
 */
class Solution {
    public void moveZeroes(int[] nums) {
        int start = 0;
        int value = 0;
        for (int i = 0; i < nums.length; i++) {
            if ((value = nums[i]) != 0) {
                nums[start++] = value;
            }
        }
        for (int i = start; i < nums.length; i++) {
            nums[i] = 0;
        }
    }
}
