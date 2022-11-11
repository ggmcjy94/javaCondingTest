package solved.bronze3;

import java.util.Scanner;

public class 오븐시계 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int m = sc.nextInt();
        int t = sc.nextInt();
        m = m + t;

        while (m >= 60) {
            h += 1;
            m = m - 60;
        }
        if (h >= 24) {
            h = h-24;
        }
        System.out.println(h +" " + m);
    }
}
