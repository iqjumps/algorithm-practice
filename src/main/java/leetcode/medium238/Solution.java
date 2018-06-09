package leetcode.medium238;

/**
 * 238. Product of Array Except Self
 * https://leetcode.com/problems/product-of-array-except-self/description/
 * <p>
 * Note: Please solve it without division and in O(n).
 * Follow up:
 * Could you solve it with constant space complexity?
 * (The output array does not count as extra space for the purpose of space complexity analysis.)
 */
class Solution {
    public int[] productExceptSelf(int[] nums) {
        int length = nums.length;
        int[] output = new int[length];

        output[length - 1] = nums[length - 1];
        for (int i = length - 2; i > 0; i--) {
            output[i] = output[i + 1] * nums[i];
        }
        output[0] = output[1];
        int product = nums[0];
        for (int i = 1; i < length - 1; i++) {
            output[i] = product * output[i + 1];
            product *= nums[i];
        }
        output[length - 1] = product;
        return output;
    }
}
