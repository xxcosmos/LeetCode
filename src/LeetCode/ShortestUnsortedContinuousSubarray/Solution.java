package LeetCode.ShortestUnsortedContinuousSubarray;

import java.util.Arrays;

/**
 * @author xandcosmos@gmail.com
 * @date 2019-11-07 16:53
 */
public class Solution {
    public int findUnsortedSubarray(int[] nums) {
        int minIndex = 0;
        int maxIndex = nums.length - 1;
        int[] sortedNums = nums.clone();
        Arrays.sort(sortedNums);
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != sortedNums[i]) {
                break;
            }
            minIndex += 1;
        }
        for (int i = nums.length - 1; i >= 0; i--) {
            if (nums[i] != sortedNums[i]) {
                break;
            }
            maxIndex -= 1;
        }
        int distance = maxIndex - minIndex;
        return distance > 0 ? distance + 1 : 0;
    }
}
