package leetcode.medium152;

/**
 * 152. Maximum Product Subarray
 * https://leetcode.com/problems/maximum-product-subarray/description/
 */
class Solution {
    public int maxProduct(int[] nums) {
        int max = nums[0];
        int mul = 1;
        int minus = 0;
        for (int i=0; i<nums.length; i++) {
            if (nums[i] == 0) {
                max = Math.max(max, 0);
               mul = 1;
               minus = 0;
               continue;
            }
            mul *= nums[i];
            if (mul > 0) {
                max = Math.max(max, mul);
            } else if (minus == 0) {
                minus = mul;
            } else {
                max = Math.max(max, mul/minus);
            }
        }
        return max;
    }
}
