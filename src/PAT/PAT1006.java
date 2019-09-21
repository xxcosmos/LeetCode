package PAT;

import java.util.Scanner;

/**
 * @author xandcosmos@gmail.com
 * @date 2019-09-21 13:39
 */
public class PAT1006 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        String name = null;
        String time = null;
        String[] times = null;
        int hour = 0, minute = 0, second = 0;
        Student signIn = new Student("signIn", 25, 0, 0);
        Student signOut = new Student("signOut", -1, 0, 0);
        for (int i = 0; i < num; i++) {
            name = in.next();
            time = in.next();
            times = time.split(":");
            hour = Integer.valueOf(times[0]);
            minute = Integer.valueOf(times[1]);
            second = Integer.valueOf(times[2]);
            if (hour < signIn.hour || (hour == signIn.hour && minute < signIn.minute) || (hour == signIn.hour && minute == signIn.minute && second < signIn.second)) {
                signIn.name = name;
                signIn.hour = hour;
                signIn.minute = minute;
                signIn.second = second;
            }
            time = in.next();
            times = time.split(":");
            hour = Integer.valueOf(times[0]);
            minute = Integer.valueOf(times[1]);
            second = Integer.valueOf(times[2]);
            if (hour > signOut.hour || (hour == signOut.hour && minute > signOut.minute) || (hour == signOut.hour && minute == signOut.minute && second > signOut.second)) {
                signOut.name = name;
                signOut.hour = hour;
                signOut.minute = minute;
                signOut.second = second;
            }
        }
        System.out.printf("%s %s\n", signIn.name, signOut.name);
    }
}

class Student {
    String name;
    int hour;
    int minute;
    int second;

    public Student(String name, int hour, int minute, int second) {
        this.name = name;
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public Student() {

    }
}
