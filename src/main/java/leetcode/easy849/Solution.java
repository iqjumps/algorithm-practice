package leetcode.easy849;

/**
 * 849. Maximize Distance to Closest Person
 * https://leetcode.com/problems/maximize-distance-to-closest-person/description/
 */
class Solution {
    public int maxDistToClosest(int[] seats) {
        int last = -1;
        int max = 1;
        for (int i=0; i<seats.length; i++) {
            if (seats[i] == 1) {
                if (last == -1) {
                    max = Math.max(max, i);
                } else {
                    max = Math.max(max, (i - last)/2);
                }
                last = i;
            }
        }
        max = Math.max(max, seats.length - 1 - last);
        return max;
    }
}
