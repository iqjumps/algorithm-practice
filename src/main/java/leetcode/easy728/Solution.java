package leetcode.easy728;

import java.util.ArrayList;
import java.util.List;

/**
 * 728. Self Dividing Numbers
 * https://leetcode.com/problems/self-dividing-numbers/
 */
public class Solution {
    static boolean valid[] = new boolean[10001];
    static {
        int num; boolean isValid; int digit;
        for (int i=1; i<=10000; i++) {
            num = i;
            isValid = true;
            while(num > 0) {
                digit = num%10;
                if (digit == 0 || i%digit != 0) {
                    isValid = false;
                    break;
                }
                num = num/10;
            }
            if (isValid) {
                valid[i] = true;
            }
        }
    }

    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> list = new ArrayList<>();
        for (int i = left; i<= right; i++) {
            if(valid[i]) {
                list.add(i);
            }
        }
        return list;
    }
}