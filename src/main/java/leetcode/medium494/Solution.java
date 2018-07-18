package leetcode.medium494;

import java.util.Arrays;

/**
 * 494. Target Sum
 * https://leetcode.com/problems/target-sum/description/
 */
class Solution {
    public int findTargetSumWays(int[] nums, int S) {
        int sum = 0;
        int zeroCount = 0;
        for (int i=0; i<nums.length; i++) {
            sum += nums[i];
            nums[i] *= 2;
            if (nums[i] == 0) {
                zeroCount++;
            }
        }
        if (sum == S) {
            return (int) Math.pow(2, zeroCount);
        } else if (sum < S) {
            return 0;
        }
        sum = sum - S;
        Arrays.sort(nums);
        int[][] cache = new int[nums.length][sum+1];
        for (int i=0; i<nums.length; i++) {
            for (int j=0; j<sum+1; j++) {
                cache[i][j] = -1;
            }
        }
        return next(0, nums, sum, cache);
    }

    public int next(int cur, int[] nums, int remain, int[][] cache) {
        if (remain < 0) {
            return 0;
        }
        if (remain == 0) {
            return 1;
        }
        if (cur == nums.length) {
            return remain == 0 ? 1 : 0;
        }
        int result = cache[cur][remain];
        if (result != -1) {
            return result;
        }
        result = 0;
        if (nums[cur] <= remain) {
            result += next(cur + 1, nums, remain, cache);
            result += next(cur + 1, nums, remain - nums[cur], cache);
        }
        cache[cur][remain] = result;
        return result;
    }
}
