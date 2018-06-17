package leetcode.hard854;


import java.util.HashMap;
import java.util.Map;

/**
 * 854. K-Similar Strings
 * https://leetcode.com/problems/k-similar-strings/description/
 */
class Solution {
    char[] arr1 = null;
    char[] arr2 = null;
    int length;
    Map<String, Integer> map = new HashMap<>();

    public int kSimilarity(String A, String B) {
        arr1 = A.toCharArray();
        arr2 = B.toCharArray();
        length = arr1.length;
        map.clear();
        return solve(0);
    }

    public int solve(int cur) {
        if (cur == length - 1) {
            return arr1[cur] == arr2[cur] ? 0 : 9999;
        }
        String str = String.valueOf(arr1);
        if (map.containsKey(str)) {
            return map.get(str);
        }
        for (int i=cur; i<length-1; i++) {
            char a = arr1[i];
            char b = arr2[i];
            if (a != b) {
                int min = 9999;
                for (int j = i + 1; j < length; j++) {
                    if (arr1[j] == b) {
                        arr1[j] = a;
                        arr1[i] = b;
                        min = Math.min(min, 1 + solve(i+1));
                        arr1[j] = b;
                        arr1[i] = a;
                    }
                }
                map.put(str, min);
                return min;
            }
        }
        return 0;
    }
}
