package leetcode.medium75;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 75. Sort Colors
 * https://leetcode.com/problems/sort-colors/
 */
class Solution {
    public void sortColors(int[] nums) {
        int l = 0;
        int r = nums.length - 1;

        int i = 0;
        while(i <= r) {
            if (nums[i] == 2) {
                int tmp = nums[r];
                nums[r--] = nums[i];
                nums[i] = tmp;
            } else if (nums[i] == 0) {
                if (i <= l) {
                    i++;
                    l++;
                } else {
                    int tmp = nums[l];
                    nums[l++] = nums[i];
                    nums[i] = tmp;
                }
            } else {
                i++;
            }
        }
    }
}