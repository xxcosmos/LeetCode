package PAT;

import java.util.*;

/**
 * @author xandcosmos@gmail.com
 * @date 2019-09-13 01:25
 */
public class PAT1002 {


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        List<Poly> list1 = new ArrayList<>();
        List<Poly> list2 = new ArrayList<>();
        List<Poly> list = new ArrayList<>();

        int sizeA = in.nextInt();
        for (int i = 0; i < sizeA; i++) {
            Poly poly = new Poly();
            poly.a = in.nextInt();
            poly.b = in.nextDouble();
            list1.add(poly);
        }

        int sizeB = in.nextInt();
        for (int i = 0; i < sizeB; i++) {
            Poly poly = new Poly();
            poly.a = in.nextInt();
            poly.b = in.nextDouble();
            list2.add(poly);
        }
        int a = 0, b = 0;
        while (a < sizeA || b < sizeB) {
            if (a < sizeA && b < sizeB) {
                if (list1.get(a).a > list2.get(b).a) {
                    list.add(list1.get(a));
                    a++;
                } else if (list1.get(a).a < list2.get(b).a) {
                    list.add(list2.get(b));
                    b++;
                } else {
                    list1.get(a).b += list2.get(b).b;
                    list.add(list1.get(a));
                    a++;
                    b++;
                }
                continue;
            }
            if (a < sizeA) {
                list.add(list1.get(a));
                a++;
            }
            if (b < sizeB) {
                list.add(list2.get(b));
                b++;
            }
        }
        System.out.print(list.size());
        for (Poly p : list) {
            System.out.printf(" %d %.1f", p.a, p.b);
        }
        System.out.println();

    }
}

class Poly {
    int a;
    double b;
}