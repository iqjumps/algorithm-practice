package leetcode.medium200;

/**
 * 200. Number of Islands
 * https://leetcode.com/problems/number-of-islands/
 */
class Solution {
    public int numIslands(char[][] grid) {
        int m = grid.length;
        if (m == 0) {
            return 0;
        }
        int n = grid[0].length;
        if (n == 0) {
            return 0;
        }
        char max = '0';
        int duplicate = 0;
        char left = 0;
        char up = 0;

        for (int i=0; i<m; i++) {
            for (int j=0; j<n; j++) {
                if (grid[i][j] == '0') {
                    continue;
                }
                left = j==0?'0':grid[i][j-1];
                up = i==0?'0':grid[i-1][j];
                if (left == '0') {
                    grid[i][j] = up=='0'?++max:up;
                } else {
                    if (up == '0') {
                        grid[i][j] = left;
                    } else {
                        if (left == up) {
                            grid[i][j] = left;
                        } else {
                            duplicate++;
                            for (int k=j-1; k>=0; k--) {
                                if (grid[i][k]==left) grid[i][k] = up;
                            }
                            grid[i][j] = up;
                        }
                    }
                }
            }
        }
        return max - '0' - duplicate;
    }
}
