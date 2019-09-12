package PAT;

import java.util.Scanner;

/**
 * @author xandcosmos@gmail.com
 * @date 2019-09-13 00:31
 */
public class PAT1001 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        a += b;
        if (a < 0) {
            System.out.print("-");
            a = -a;
        }

        char[] array = String.valueOf(a).toCharArray();
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if ((i + 1) % 3 == array.length % 3 && i + 1 != array.length) {
                System.out.print(",");
            }
        }
        System.out.println();
    }
}
