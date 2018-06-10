package leetcode.medium848;

/**
 * 848. Shifting Letters
 * https://leetcode.com/problems/shifting-letters/description/
 */
class Solution {
    public String shiftingLetters(String S, int[] shifts) {
        int sum = 0;
        char[] arr = S.toCharArray();
        for (int i=shifts.length-1; i>=0; i--) {
            sum = (sum + shifts[i]) % 26;
            arr[i] = shift(arr[i], sum);
        }
        return String.valueOf(arr);
    }

    public char shift(char chr, int shifts) {
        return (char) ((chr - 'a' + shifts) % 26 + 'a');
    }
}
