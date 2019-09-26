package PAT;

import java.util.Scanner;

/**
 * @author xandcosmos@gmail.com
 * @date 2019-09-26 21:14
 */
public class PAT1058 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[] strings = in.nextLine().split(" ");
        String[] a = strings[0].split("\\.");
        String[] b = strings[1].split("\\.");
        int galleon = Integer.valueOf(a[0]) + Integer.valueOf(b[0]);
        int sickle = Integer.valueOf(a[1]) + Integer.valueOf(b[1]);
        int knut = Integer.valueOf(a[2]) + Integer.valueOf(b[2]);
        if (knut > 28) {
            knut -= 29;
            sickle += 1;
        }
        if (sickle > 16) {
            sickle -= 17;
            galleon += 1;
        }

        System.out.printf("%d.%d.%d\n", galleon, sickle, knut);
    }
}
