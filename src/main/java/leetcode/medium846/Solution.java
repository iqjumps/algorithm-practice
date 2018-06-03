package leetcode.medium846;

import java.util.Arrays;

/**
 * 846. Hand of Straights
 * https://leetcode.com/contest/weekly-contest-87/problems/hand-of-straights/
 */
class Solution {
    public boolean isNStraightHand(int[] hand, int W) {
        if (hand.length % W != 0) {
            return false;
        }
        int groupSize = hand.length / W;
        Arrays.sort(hand);
        int[] groups = new int[groupSize];
        int[] sizes = new int[groupSize];

        for (int i = 0; i < hand.length; i++) {
            boolean put = false;
            for (int j = 0; j < groupSize; j++) {
                if (sizes[j] == 0 || (groups[j] == hand[i] - 1 && sizes[j] < W)) {
                    groups[j] = hand[i];
                    sizes[j]++;
                    put = true;
                    break;
                }
            }
            if (!put) {
                return false;
            }
        }
        return true;
    }
}
