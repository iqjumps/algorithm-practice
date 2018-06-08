package leetcode.medium468;

/**
 * 468. Validate IP Address
 * https://leetcode.com/problems/validate-ip-address/description/
 */
class Solution {
    private static String IPV6_REGEX = "[0-9a-fA-F]{1,4}:[0-9a-fA-F]{1,4}:[0-9a-fA-F]{1,4}:[0-9a-fA-F]{1,4}:[0-9a-fA-F]{1,4}:[0-9a-fA-F]{1,4}:[0-9a-fA-F]{1,4}:[0-9a-fA-F]{1,4}";

    public String validIPAddress(String IP) {
        if (IP.startsWith(".") || IP.endsWith(".")) {
            return "Neither";
        }
        String[] arr = IP.split("\\.");
        if (arr.length == 1) {
            return IP.matches(IPV6_REGEX) ? "IPv6" : "Neither";
        } else if (arr.length == 4) {
            try {
                for (String str : arr) {
                    int num = Integer.parseInt(str);
                    if (num < 0 || num > 255 || (int) Math.log10(num > 0 ? num : 1) + 1 != str.length()) {
                        return "Neither";
                    }
                }
                return "IPv4";
            } catch (Exception e) {
                return "Neither";
            }
        }
        return "Neither";
    }
}