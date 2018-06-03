package leetcode.medium845;

/**
 * 845. Longest Mountain in Array
 * https://leetcode.com/contest/weekly-contest-87/problems/longest-mountain-in-array/
 */
class Solution {
    public int longestMountain(int[] A) {
        int max = 0;
        int ascLength = 0;
        int descLength = 0;
        for (int i = 1; i < A.length; i++) {
            if (A[i] > A[i - 1]) {
                if (descLength > 0) {
                    ascLength = 0;
                }
                ascLength++;
                descLength = 0;
            } else if (A[i] < A[i - 1]) {
                descLength++;
                if (ascLength > 0) {
                    max = Math.max(max, ascLength + descLength + 1);
                }
            } else {
                ascLength = 0;
                descLength = 0;
            }
        }
        return max;
    }
}
