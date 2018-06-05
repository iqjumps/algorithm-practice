package leetcode.medium611;

import java.util.Arrays;

/**
 * 611. Valid Triangle Number
 * https://leetcode.com/problems/valid-triangle-number/description/
 */
class Solution {
    public int triangleNumber(int[] nums) {
        Arrays.sort(nums);
        int length = nums.length;
        int count = 0;
        for (int i = 0; i < length - 2; i++) {
            if (nums[i] == 0) {
                continue;
            }
            int k = i + 2;
            for (int j = i + 1; j < length - 1; j++) {
                while(k < length && nums[i] + nums[j] > nums[k]) {
                    k++;
                }
                count += k - j -1;
            }
        }
        return count;
    }
}


