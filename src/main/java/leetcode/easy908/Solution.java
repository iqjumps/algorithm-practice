package leetcode.easy908;

/**
 * 908. Smallest Range I
 * https://leetcode.com/problems/smallest-range-i/
 */
class Solution {
    public int smallestRangeI(int[] A, int K) {
        if (A.length <= 1) {
            return 0;
        }
        int min = 10001;
        int max = -1;
        for (int a : A) {
            if (min > a) {
                min = a;
            }
            if (max < a) {
                max = a;
            }
        }
        int gap = max - min - (2 * K);
        return gap > 0 ? gap : 0;
    }
}