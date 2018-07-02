package leetcode.hard301;

import java.util.*;

/**
 * 301. Remove Invalid Parentheses
 * https://leetcode.com/problems/remove-invalid-parentheses/description/
 */
class Solution {
    public List<String> removeInvalidParentheses(String s) {
        char[] arr = s.toCharArray();
        int open = 0;
        int close = 0;
        for (char ch : arr) {
            if (ch == '(') {
                open++;
            } else if (ch == ')') {
                if (open > 0) {
                    open--;
                } else {
                    close++;
                }
            }
        }
//        System.out.println(open + ", " + close);

        Set<String> set = new HashSet<>();
        next(0, arr, open, close, set);
        return new ArrayList<>(set);
    }

    public void next(int cur, char[] arr, int open, int close, Set<String> set) {
        if (cur == arr.length) {
            if (isValid(arr)) {
                set.add(String.valueOf(arr).replaceAll("_", ""));
            }
            return;
        }
        char ch = arr[cur];
        if (ch == '(' && open > 0) {
            arr[cur] = '_';
            next(cur+1, arr, open-1, close, set);
            arr[cur] = '(';
        } else if (ch == ')' && close > 0) {
            arr[cur] = '_';
            next(cur+1, arr, open, close-1, set);
            arr[cur] = ')';
        }
        next(cur+1, arr, open, close, set);
    }

    public boolean isValid(char[] arr) {
        int open = 0;
        for (char ch : arr) {
            if (ch == '(') {
                open++;
            } else if (ch == ')') {
                if (open > 0) {
                    open--;
                } else {
                    return false;
                }
            }
        }
        return (open == 0);
    }
}
