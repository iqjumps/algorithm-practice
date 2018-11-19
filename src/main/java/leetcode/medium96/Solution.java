package leetcode.medium96;

/**
 * 96. Unique Binary Search Trees
 * https://leetcode.com/problems/unique-binary-search-trees/
 */
class Solution {
    public int numTrees(int n) {
        int[][] cache = new int[n + 1][n + 1];
        return count(1, n, cache);
    }

    public int count(int min, int max, int[][] cache) {
        if (min >= max) {
            return 1;
        }
        if (cache[min][max] != 0) {
            return cache[min][max];
        }
        int result = 0;
        for (int i = min; i <= max; i++) {
            // i is parent
            result += count(min, i - 1, cache) * count(i + 1, max, cache);
        }
        cache[min][max] = result;
        return result;
    }
}