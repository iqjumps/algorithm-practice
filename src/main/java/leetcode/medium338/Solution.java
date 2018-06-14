package leetcode.medium338;

/**
 * 338. Counting Bits
 * https://leetcode.com/problems/counting-bits/description/
 */
class Solution {

    public int[] countBits(int num) {
        if (num == 0) {
            return new int[]{0};
        }
        int[] counts = new int[num + 1];
        counts[1] = 1;
        int divider = 1;
        for (int i = 2; i <= num; i++) {
            if (i == 2 * divider) {
                divider = i;
            }
            counts[i] = 1 + counts[i % divider];
        }
        return counts;

    }

    public int[] countBits2(int num) {
        if (num == 0) {
            return new int[]{0};
        }
        int[] counts = new int[num + 1];
        int i = 1;
        while (i <= num) {
            for (int j = 0; j < i && i + j <= num; j++) {
                counts[i + j] = 1 + counts[j];
            }
            i *= 2;
        }
        return counts;
    }

    public int[] countBits3(int num) {
        if (num == 0) {
            return new int[]{0};
        }
        int[] counts = new int[num + 1];
        int i = 1, j = 0;
        while (i + j <= num) {
            counts[i + j] = 1 + counts[j++];
            if (i == j) {
                i *= 2;
                j = 0;
            }
        }
        return counts;
    }
}
