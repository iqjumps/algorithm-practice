package leetcode.medium5;

/**
 * 5. Longest Palindromic Substring
 * https://leetcode.com/problems/longest-palindromic-substring/hints/
 */
class Solution {
    public String longestPalindrome(String s) {
        int length = s.length();
        if (length == 1) {
            return s;
        }
        boolean[][] isPalidrome = new boolean[length][length];

        int start = 0, end = 0, max = 0;
        char[] arr = s.toCharArray();
        for (int i = length - 2; i >= 0; i--) {
            for (int j = i + 1; j < length; j++) {
                int size = j - i + 1;
                if ((size <= 3 || isPalidrome[i + 1][j - 1]) && arr[i] == arr[j]) {
                    isPalidrome[i][j] = true;
                    if (size > max) {
                        max = size;
                        start = i;
                        end = j;
                    }
                }
            }
        }
        return s.substring(start, end + 1);
    }
}
