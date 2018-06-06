package leetcode.medium179;

import java.util.Arrays;
import java.util.Comparator;

/**
 * 179. Largest Number
 * https://leetcode.com/problems/largest-number/description/
 */
class Solution {
    public String largestNumber(int[] nums) {
        Comparator<String> comparator = new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                int length1 = o1.length();
                int length2 = o2.length();
                if (length1 < length2 && o1.compareTo(o2.substring(0, length1)) == 0) {
                    return compare(o1, o2.substring(length1));
                } else if (length1 > length2 && o1.substring(0, length2).compareTo(o2) == 0) {
                    return compare(o1.substring(length2), o2);
                }
                return o1.compareTo(o2);
            }
        };

        //System.out.println("---" + comparator.compare(213, 2));
        String[] arr = new String[nums.length];
        for (int i = 0; i < nums.length; i++) {
            arr[i] = String.valueOf(nums[i]);
        }
        Arrays.sort(arr, comparator);
        StringBuilder sb = new StringBuilder();
        for (int i = nums.length - 1; i >= 0; i--) {
            sb.append(arr[i]);
        }
        return sb.toString().replaceFirst("^0+", "0");
    }
}