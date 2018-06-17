package leetcode.easy852;

/**
 * 852. Peak Index in a Mountain Array
 * https://leetcode.com/problems/peak-index-in-a-mountain-array/description/
 */
class Solution {
    public int peakIndexInMountainArray(int[] A) {
        int max = -1;
        int cand = -1;
        for (int i=0; i<A.length; i++) {
            if (A[i] > max) {
                max = A[i];
                cand = i;
            }
        }
        return cand;
    }
}
