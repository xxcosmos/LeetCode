package LeetCode.TaskScheduler;

import java.util.ArrayList;
import java.util.List;

/**
 * @author xandcosmos@gmail.com
 * @date 2019-11-11 16:51
 */
public class Solution {
    List<Integer> seq = new ArrayList<>();

    public boolean canAdd(int task, int n) {
        int beginIndex = seq.size() - 1 - n;
        beginIndex = beginIndex >= 0 ? beginIndex : 0;
        return seq.subList(beginIndex, seq.size()).contains(task);
    }

    public int leastInterval(char[] tasks, int n) {
        int[] bucket = new int[26];
        for (char task : tasks) {
            bucket[task - 'A']++;
        }
        int taskNum = tasks.length;
        while (taskNum > 0) {
            boolean flag = false;
            for (int i = 0; i < bucket.length; i++) {
                if (bucket[i] != 0 && canAdd(i, n)) {
                    seq.add(i);
                    taskNum--;
                    flag = true;
                }
            }
            if (!flag) {
                seq.add(-1);
            }

        }
        return seq.size();
    }
}
