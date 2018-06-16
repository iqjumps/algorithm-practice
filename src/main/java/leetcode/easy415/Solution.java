package leetcode.easy415;

/**
 * 415. Add Strings
 * https://leetcode.com/problems/add-strings/description/
 */
class Solution {
    public String addStrings(String num1, String num2) {
        char[] arr1 = num1.toCharArray();
        char[] arr2 = num2.toCharArray();
        int added = 0;
        char[] sums = new char[Math.max(arr1.length, arr2.length)];

        int i = arr1.length - 1;
        int j = arr2.length - 1;
        while (i >= 0 || j >= 0) {
            int a = i < 0 ? 0 : arr1[i]-'0';
            int b = j < 0 ? 0 : arr2[j]-'0';
            int c = a + b + added;
            sums[Math.max(i--, j--)] = (char) ('0' + (c % 10));
            added = c / 10;
        }
        return added > 0 ? added + String.valueOf(sums) : String.valueOf(sums);
    }
}
