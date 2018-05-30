package leetcode.easy53;

/**
 * 53. Maximum Subarray
 * https://leetcode.com/problems/maximum-subarray/description/
 */
class Solution {
    public int maxSubArray(int[] nums) {
        int sum = 0, min = 0, max = nums[0];
        for (int i=0; i<nums.length; i++) {
            sum += nums[i];
            max = Math.max(max, sum-min);
            min = Math.min(min, sum);
        }
        return max;
    }
}
