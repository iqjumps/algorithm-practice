package leetcode.easy448;

import java.util.ArrayList;
import java.util.List;

/**
 * 448. Find All Numbers Disappeared in an Array
 * https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/description/
 */
class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> list = new ArrayList<>();
        for (int i=0; i<nums.length; i++) {
            int num = nums[i] - 1;
            if (num < 0) {
                continue;
            }
            while (nums[num] > 0) {
                int tmp = nums[num] - 1;
                nums[num] = 0;
                num = tmp;
            }
        }
        for (int i=0; i<nums.length; i++) {
            if (nums[i] > 0) {
                list.add(i + 1);
            }
        }
        return list;
    }
}
