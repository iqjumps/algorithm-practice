package leetcode.medium647;

/**
 * 647. Palindromic Substrings
 * https://leetcode.com/problems/palindromic-substrings/description/
 */
class Solution {

    static boolean[][] isPalidrome = new boolean[1000][1000];

    public int countSubstrings(String s) {
        int length = s.length();
        if (length == 1) {
            return 1;
        }
        int count = 0;
        char[] arr = s.toCharArray();
        for (int i = length - 2; i >= 0; i--) {
            int start = arr[i];
            for (int j = i + 1; j < length; j++) {
                if ((j - i <= 2 || isPalidrome[i + 1][j - 1]) && start == arr[j]) {
                    isPalidrome[i][j] = true;
                    count++;
                } else {
                    isPalidrome[i][j] = false;
                }
            }
        }
        return count + length;
    }
}
