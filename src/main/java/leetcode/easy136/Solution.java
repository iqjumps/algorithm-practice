package leetcode.easy136;

/**
 * 136. Single Number
 * https://leetcode.com/problems/single-number/description/
 */
class Solution {
    public int singleNumber(int[] nums) {
        int result = 0;
        for (int num : nums) {
            result ^= num;
        }
        return result;
    }
}
