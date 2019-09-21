package PAT;

import java.util.Scanner;

/**
 * @author xandcosmos@gmail.com
 * @date 2019-09-21 14:15
 */
public class PAT1005 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        int sum = 0;
        while (number != 0) {
            sum += number % 10;
            number /= 10;
        }
        char[] chars = String.valueOf(sum).toCharArray();
        String str = null;
        for (int i = 0; i < chars.length; i++) {
            switch (chars[i]) {
                case '1':
                    str = "one";
                    break;
                case '2':
                    str = "two";
                    break;
                case '3':
                    str = "three";
                    break;
                case '4':
                    str = "four";
                    break;
                case '5':
                    str = "five";
                    break;
                case '6':
                    str = "six";
                    break;
                case '7':
                    str = "seven";
                    break;
                case '8':
                    str = "eight";
                    break;
                case '9':
                    str = "nine";
                    break;
                case '0':
                    str = "zero";
                    break;
                default:
                    str = "null";
            }
            if (i != chars.length - 1) {
                System.out.printf("%s ", str);
            } else {
                System.out.printf("%s\n", str);
            }

        }
    }
}
