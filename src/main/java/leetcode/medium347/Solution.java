package leetcode.medium347;

import java.util.*;

/**
 * 347. Top K Frequent Elements
 * https://leetcode.com/problems/top-k-frequent-elements/description/
 */
class Solution {
    List<Integer> topList = new ArrayList<>();

    public List<Integer> topKFrequent(int[] nums, int k) {
        if (nums.length == 1) {
            return Arrays.asList(nums[0]);
        }
        Arrays.sort(nums);
        int cur = nums[0];
        int count = 1;
        int size = 0;
        Pair[] pairs = new Pair[nums.length];
        for (int i = 1; i < nums.length; i++) {
            if (cur != nums[i]) {
                pairs[size++] = new Pair(cur, count);
                cur = nums[i];
                count = 1;
            } else {
                count++;
            }
        }
        pairs[size++] = new Pair(cur, count);
        if (size == 1) {
            return Arrays.asList(nums[0]);
        }

        Arrays.sort(pairs, 0, size);
        topList.clear();
        for (int i = 0; i < k; i++) {
            topList.add(pairs[size - i - 1].key);
        }
        return topList;
    }
    class Pair implements Comparable {
        int key;
        int value;

        public Pair(int key, int value) {
            this.key = key;
            this.value = value;
        }

        @Override
        public int compareTo(Object o) {
            return value - ((Pair)o).value;
        }
    }
}
