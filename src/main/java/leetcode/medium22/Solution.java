package leetcode.medium22;

import java.util.ArrayList;
import java.util.List;

/**
 * 22. Generate Parentheses
 * https://leetcode.com/problems/generate-parentheses/description/
 */
class Solution {
    List<String> strings = new ArrayList<>();

    public List<String> generateParenthesis(int n) {
        char[] arr = new char[2*n];
        next(n, 0,0,0,arr);
        return strings;
    }

    public void next(int n, int cur, int open, int close, char[] arr) {
//        System.out.println(String.valueOf(arr));
        if (cur == 2 * n) {
            strings.add(String.valueOf(arr));
            return;
        }
        if (open > close) { // close
            arr[cur] = ')';
            next(n, cur + 1, open, close +1, arr);
        }
        if (open < n) { // open
            arr[cur] = '(';
            next(n, cur + 1, open + 1, close, arr);
        }
    }
}
