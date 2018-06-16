package leetcode.medium334;

/**
 * 334. Increasing Triplet Subsequence
 * https://leetcode.com/problems/increasing-triplet-subsequence/description/
 */
class Solution {
    public boolean increasingTriplet(int[] nums) {
        int length = nums.length;
        if (length < 3) {
            return false;
        }
        int min = nums[0];
        int lower = Integer.MAX_VALUE;
        for (int i=1; i<length; i++) {
            int num = nums[i];
            if (lower < num) {
                return true;
            }
            if (min < num) {
                lower = Math.min(lower, num);
            }
            min = Math.min(min, num);
        }
        return false;
    }
}
