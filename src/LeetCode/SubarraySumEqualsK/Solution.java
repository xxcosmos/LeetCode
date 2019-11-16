package LeetCode.SubarraySumEqualsK;

import java.util.HashMap;
import java.util.Map;

/**
 * @author xandcosmos@gmail.com
 * @date 2019-11-16 20:16
 */
public class Solution {
    public int subarraySum(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        int sum = 0, ans = 0;
        map.put(sum, 1);
        for (int num : nums) {
            sum += num;
            if (map.containsKey(sum - k)) {
                ans += map.get(sum - k);
            }
            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }
        return ans;
    }
}
