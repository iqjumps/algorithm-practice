package leetcode.hard32;

/**
 * 32. Longest Valid Parentheses
 * https://leetcode.com/problems/longest-valid-parentheses/description/
 */
class Solution {
    public int longestValidParentheses(String s) {
        char[] arr = s.toCharArray();
        int length = arr.length;
        int[] opens = new int[length+1];
        int[] left = new int[length+1];
        int open = 0;
        int max = 0;
        for (int i=0; i<length; i++) {
            if (arr[i] == '(') {
                opens[open++] = i;
            } else {
                if (open > 0) {
                    int openIdx = opens[--open];
                    int cand = i - openIdx + 1 + left[openIdx];
                    max = Integer.max(max, cand);
                    left[i+1] = cand;
                } else {
                    open = 0;
                }
            }
        }
        return max;
    }
}
