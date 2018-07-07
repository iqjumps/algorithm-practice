package leetcode.hard10;

/**
 * 10. Regular Expression Matching
 * https://leetcode.com/problems/regular-expression-matching/description/
 */
class Solution {
    public boolean isMatch(String str, String pattern) {
        char[] s = str.toCharArray();
        char[] p = pattern.toCharArray();

        Boolean[][] cache = new Boolean[s.length][p.length];

        return isMatch(s.length - 1, p.length - 1, s, p, cache);
    }

    public boolean isMatch(int sCur, int pCur, char[] s, char[] p, Boolean[][] cache) {
        if (pCur < 0) {
            return sCur < 0;
        }
        if (sCur < 0) {
            if (pCur >= 1 && p[pCur] == '*') {
                return isMatch(sCur, pCur - 2, s, p, cache);
            }
            return false;
        }
        if (cache[sCur][pCur] != null) {
            return cache[sCur][pCur];
        }
        char ch = p[pCur];
        boolean result = false;
        if (ch == '*') {
            char ch2 = p[pCur - 1];
            if (ch2 == '.') {
                result = result || isMatch(sCur, pCur - 2, s, p, cache);
                for (int i = sCur; i >= 0; i--) {
                    result = result || isMatch(i - 1, pCur - 2, s, p, cache);
                }
            } else {
                result = result || isMatch(sCur, pCur - 2, s, p, cache);
                for (int i = sCur; i >= 0 && ch2 == s[i]; i--) {
                    result = result || isMatch(i - 1, pCur - 2, s, p, cache);
                }
            }
        } else if (ch == '.') {
            result = isMatch(sCur - 1, pCur - 1, s, p, cache);
        } else {
            result = (ch == s[sCur] && isMatch(sCur - 1, pCur - 1, s, p, cache));
        }
        cache[sCur][pCur] = result;
        return result;
    }
}
