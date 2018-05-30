package leetcode.easy258;
/**
 * Created by NAVER on 2018-05-26.
 */

/**
 * 258. Add Digits
 * https://leetcode.com/problems/add-digits/description/
 *
 * Follow up:
 * Could you do it without any loop/recursion in O(1) runtime?
 */
public class Solution {
    public int addDigits(int num) {
        return (num - 1) % 9 + 1;
    }
}
