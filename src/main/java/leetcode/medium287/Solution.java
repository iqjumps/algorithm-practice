package leetcode.medium287;

/**
 * 287. Find the Duplicate Number
 * https://leetcode.com/problems/find-the-duplicate-number/description/
 */
class Solution {
    public int findDuplicate(int[] nums) {
        return search(1, nums.length-1, nums);
    }

    public int search(int l, int r, int[] nums) {
        if (l == r) {
            return l;
        }
        int mid = (l + r) / 2;
        boolean remains = (l + r) % 2 > 0;
        boolean midFound = false;
        int flag = 0;
        for (int num : nums) {
            if (num < l || num > r) {
                continue;
            }
            if (num < mid || (num == mid && remains)) {
                flag--;
            } else if (num > mid) {
                flag++;
            } else if (num == mid) {
                if (!midFound) {
                    midFound = true;
                } else {
                    return mid;
                }
            }
        }

        if (flag < 0) {
            return search(l, remains? mid : mid - 1, nums);
        } else {
            return search(mid + 1, r, nums);
        }
    }
}
