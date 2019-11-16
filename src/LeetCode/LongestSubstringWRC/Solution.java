package LeetCode.LongestSubstringWRC;

/**
 * @author xandcosmos@gmail.com
 * @date 2019-11-16 21:08
 */
public class Solution {
    public int lengthOfLongestSubstring(String s) {
        int[] index = new int[128];
        int ans = 0;
        for (int j = 0, i = 0; j < s.length(); j++) {
            i = Math.max(index[s.charAt(j)], i);
            ans = Math.max(ans, j - i + 1);
            index[s.charAt(j)] = j + 1;
        }

        return ans;
    }
}
