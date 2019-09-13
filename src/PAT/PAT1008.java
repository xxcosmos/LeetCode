package PAT;

import java.util.Scanner;

/**
 * @author xandcosmos@gmail.com
 * @date 2019-09-13 17:46
 */
public class PAT1008 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int result = 0;
        int nowFloor = 0;
        int x = 0;
        for (int i = 0; i < n; i++) {
            x = in.nextInt();
            if (x > nowFloor) {
                result += 6 * (x - nowFloor);
                result += 5;
                nowFloor = x;
            } else if (x < nowFloor) {
                result += 4 * (nowFloor - x);
                result += 5;
                nowFloor = x;
            } else {
                result += 5;
            }
        }
        System.out.println(result);
    }
}
