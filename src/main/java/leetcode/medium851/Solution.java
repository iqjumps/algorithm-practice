package leetcode.medium851;

import java.util.*;

/**
 * 851. Loud and Rich
 * https://leetcode.com/problems/loud-and-rich/description/
 */
class Solution {

    private static int[][] children = new int[500][500];
    private static int[] count = new int[500];
    private static int[] quieter = new int[500];

    public int[] loudAndRich(int[][] richer, int[] quiet) {

        for (int i=0; i<quieter.length; i++) {
            count[i] = 0;
            quieter[i] = i;
        }

        for (int i=0; i<richer.length; i++) {
            int x = richer[i][0];
            int y = richer[i][1];
            children[x][count[x]++] = y;
            update(x, quieter[x], quiet);
        }

        return Arrays.copyOf(quieter, quiet.length);
    }

    public void update(int cur, int pQuieter, int[] quiet) {
        if (quiet[quieter[cur]] < quiet[pQuieter]) {
            return;
        }
        quieter[cur] = pQuieter;
        for (int i = 0; i < count[cur]; i++) {
            update(children[cur][i], pQuieter, quiet);
        }
    }
}
