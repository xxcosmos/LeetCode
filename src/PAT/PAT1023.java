package PAT;

import java.util.Scanner;

/**
 * @author xandcosmos@gmail.com
 * @date 2019-09-28 21:23
 */
public class PAT1023 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        char[] chars = s.toCharArray();
        int[] after = new int[chars.length + 1];
        int[] bucket = new int[10];
        for (int i = chars.length - 1; i >= 0; i--) {
            bucket[chars[i] - '0']++;
            after[chars.length - 1 - i] += (chars[i] - '0') * 2;
            if (after[chars.length - 1 - i] > 9) {
                after[chars.length - 1 - i] -= 10;
                after[chars.length - i] += 1;
            }
            bucket[after[chars.length - 1 - i]]--;
        }


        boolean flag = true;
        for (int value : bucket) {
            if (value != 0) {
                flag = false;
                break;
            }
        }
        if (flag) {
            System.out.println("Yes");

        } else {
            System.out.println("No");
        }
        for (int i = after.length - 2; i >= 0; i--) {
            System.out.printf("%d", after[i]);
        }


    }
}
