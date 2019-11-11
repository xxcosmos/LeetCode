package LeetCode.DailyTemperatures;

import java.util.Arrays;

/**
 * @author xandcosmos@gmail.com
 * @date 2019-11-11 16:07
 */
public class Solution {
    public int[] dailyTemperatures(int[] T) {
        int[] array = new int[T.length];
        for (int i = T.length - 1; i >= 0; i--) {
            int day = 0;
            for (int j = T.length - 1; j > i; j--) {
                if (T[j] > T[i]) {
                    day = j - i;
                }
            }
            array[i] = day;
        }
        return array;
    }
}
