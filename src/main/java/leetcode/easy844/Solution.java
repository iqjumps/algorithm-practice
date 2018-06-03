package leetcode.easy844;

/**
 * 844. Backspace String Compare
 * https://leetcode.com/contest/weekly-contest-87/problems/backspace-string-compare/
 */
class Solution {
    public boolean backspaceCompare(String S, String T) {
        return getString(S).equals(getString(T));
    }

    public String getString(String str) {
        char[] arr = str.toCharArray();
        StringBuilder sb = new StringBuilder();
        int backspace = 0;
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] == '#') {
                backspace++;
            } else if (backspace > 0) {
                backspace--;
            } else {
                sb.append(arr[i]);
            }
        }
        return sb.toString();
    }
}
