package leetcode.easy1;

import java.util.HashMap;
import java.util.Map;

/**
 * 1. Two Sum
 * https://leetcode.com/problems/two-sum/description/
 */
class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        Integer found = null;
        for (int i = 0; i < nums.length; i++) {
            if ((found = map.get(target - nums[i])) != null) {
                return new int[]{found, i};
            }
            map.put(nums[i], i);
        }
        return null;
    }
}
