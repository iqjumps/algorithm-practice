package leetcode.hard42;

/**
 * 42. Trapping Rain Water
 * https://leetcode.com/problems/trapping-rain-water/description/
 */
class Solution {

    public int trap(int[] height) {
        int length = height.length;
        if (length < 3) {
            return 0;
        }
        int start = 0;
        while (height[start] == 0) {
            start++;
        }
        int max = height[start];
        int sum = 0;
        for (int i = start + 1; i < length; i++) {
            int cur = height[i];
            if (height[i - 1] < cur && i > start + 1) {
                int h = Math.min(max, cur);
                for (int j = i - 1; j > start && h > height[j]; j--) {
                    sum += h - height[j];
                    height[j] = h;
                }
                if (cur >= max) {
                    start = i;
                    max = cur;
                }
            }
        }
        return sum;
    }
}
