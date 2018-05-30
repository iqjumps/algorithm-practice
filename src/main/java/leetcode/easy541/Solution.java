package leetcode.easy541;
/**
 * Created by NAVER on 2018-05-26.
 */

/**
 * 541. Reverse String II
 * https://leetcode.com/problems/reverse-string-ii/description/
 */
class Solution {
    public String reverseStr(String s, int k) {
        if (k == 1) {
            return s;
        }
        char[] arr = s.toCharArray();
        char[] result = new char[arr.length];
        for (int i=0; i<arr.length; i++) {
            if ((i/k)%2 == 0) {
                result[i] = arr[min(arr.length-1, (i/k)*k + k -1) - (i%k)];
            } else {
                result[i] = arr[i];
            }
        }
        return String.valueOf(result);
    }
    private static int min(int a, int b) {
        if (a < b) {
            return a;
        }
        return b;
    }
}
