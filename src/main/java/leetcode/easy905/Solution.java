package leetcode.easy905;

/**
 * 905. Sort Array By Parity
 * https://leetcode.com/problems/sort-array-by-parity/
 */
class Solution {
    public int[] sortArrayByParity(int[] A) {
        int length = A.length;
        if (length == 1) {
            return A;
        }
        int i = 0;
        int j = length - 1;
        int tmp = 0;

        do {
            while (i < length && A[i] % 2 == 0) {
                i++;
            }
            while (j >= 0 && A[j] % 2 == 1) {
                j--;
            }
            if (i < j) {
                tmp = A[i];
                A[i] = A[j];
                A[j] = tmp;
                i++;
                j--;
            }
        } while (i <= j);
        return A;
    }
}
