package LeetCode.MajorityElement;

public class Solution {
    public int majorityElement(int[] nums) {
        int res = nums[0], cnt = 0;
        for (int num : nums) {
            if (num == res) {
                cnt++;
            } else {
                cnt--;
            }
            if (cnt == 0) {
                res = num;
                cnt++;
            }
        }
        return res;
    }
}
