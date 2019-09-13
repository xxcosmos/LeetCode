package PAT;

import java.util.Scanner;

/**
 * @author xandcosmos@gmail.com
 * @date 2019-09-13 17:31
 */
public class PAT1011 {
    public static void main(String[] args) {
        double odd = 0, max = 0, result = 0.65;
        int maxID = -1;
        Scanner in = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            max = 0;
            maxID = -1;
            for (int j = 0; j < 3; j++) {
                odd = in.nextDouble();
                if (odd > max) {
                    max = odd;
                    maxID = j;
                }

            }
            switch (maxID) {
                case 0:
                    System.out.print("W ");
                    break;
                case 1:
                    System.out.print("T ");
                    break;
                case 2:
                    System.out.print("L ");
                    break;
                default:
                    System.out.println();
                    break;
            }
            result *= max;
        }
        System.out.printf("%.2f\n", (result - 1) * 2);
    }
}
