package leetcode.easy643;

/**
 * 643. Maximum Average Subarray I
 * https://leetcode.com/problems/maximum-average-subarray-i/description/
 */
class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int sum = 0;
        for (int i=0; i<k; i++) {
            sum += nums[i];
        }
        int maxSum = sum;
        for (int i=k; i<nums.length; i++) {
            sum += nums[i] - nums[i-k];
            maxSum = max(maxSum, sum);
        }

        return maxSum / (double) k;
    }
    private static int max(int a, int b) {
        if (a > b) {
            return a;
        }
        return b;
    }
}
