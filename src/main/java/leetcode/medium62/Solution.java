package leetcode.medium62;

/**
 * 62. Unique Paths
 * https://leetcode.com/problems/unique-paths/
 */
class Solution {
    public int uniquePaths(int m, int n) {
        int[][] count = new int[m+1][n+1];
        count[0][1] = 1;
        for (int i=1; i<=m; i++) {
            for (int j=1; j<=n; j++) {
                count[i][j] = count[i][j-1] + count[i-1][j];
            }
        }
        return count[m][n];
    }
}
