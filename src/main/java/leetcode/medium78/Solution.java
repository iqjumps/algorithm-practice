package leetcode.medium78;

import java.util.*;

/**
 * 78. Subsets
 * https://leetcode.com/problems/subsets/description/
 */
class Solution {
    List<List<Integer>> lists = new ArrayList<>();

    public List<List<Integer>> subsets(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }
        int length = set.size();
        Integer[] arr = new Integer[length];
        set.toArray(arr);
        boolean[] selected = new boolean[length];
        pick(0, length, selected, arr);
        return lists;
    }

    public void pick(int idx, int length, boolean[] selected, Integer[] nums) {
        if (idx >= length) {
            List<Integer> list = new ArrayList<>();
            for (int i = 0; i < length; i++) {
                if (selected[i]) {
                    list.add(nums[i]);
                }
            }
            lists.add(list);
            return;
        }
        pick(idx + 1, length, selected, nums);
        selected[idx] = true;
        pick(idx + 1, length, selected, nums);
        selected[idx] = false;
    }

    public List<List<Integer>> subsets2(int[] nums) {
        Arrays.sort(nums);
        pick2(0, nums.length, nums, new ArrayList());

        return lists;
    }

    public void pick2(int idx, int end, int[] nums, List list) {
        if (idx >= end) {
            lists.add(new ArrayList(list));
            return;
        }
        int num = nums[idx];
        int next = idx + 1;
        while (next < end && num == nums[next]) {
            next++;
        }
        list.add(num);
        pick2(next, end, nums, list);
        list.remove(list.size() - 1);
        pick2(next, end, nums, list);
    }
}
