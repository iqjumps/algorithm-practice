package leetcode.hard84;

/**
 * 84. Largest Rectangle in Histogram
 * https://leetcode.com/problems/largest-rectangle-in-histogram/description/
 */
class Solution {
    public int largestRectangleArea(int[] heights) {
        if (heights.length == 0) {
            return 0;
        }
        return search(0, heights.length, heights);
    }

    public int search(int left, int right, int[] heights) {
        if (left + 2 == right) {
            if (heights[left] > heights[right-1]) {
                return Math.max(heights[left], heights[right-1] * 2);
            } else {
                return Math.max(heights[right-1], heights[left] * 2);
            }
        } else if (left + 1 == right) {
            return heights[left];
        }

        int mid = (left + right) / 2;
        int max = 0;
        max = Math.max(max, search(left, mid, heights));
        max = Math.max(max, search(mid, right, heights));
        int l = mid;
        int r = mid + 1;
        int min = Integer.MAX_VALUE;
        while (left <= l || r < right) {
            if (left <= l && (r >= right || heights[l] > heights[r])) {
                min = Math.min(min, heights[l]);
                max = Math.max(max, min * (r - l));
                l--;
            } else if (r < right) {
                min = Math.min(min, heights[r]);
                max = Math.max(max, min * (r - l));
                r++;
            } else {
                break;
            }
        }
        return max;
    }
}
