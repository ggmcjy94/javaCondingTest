package solved.bronze3;

import java.util.Scanner;

public class 윷놀이 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 3;
        int k = 4;

        for (int i = 0; i < n; i++) {
            int b = 0;
            for (int j = 0; j < k; j++) {
                int t = sc.nextInt();
                if (t == 1) {
                    b++;
                }
            }
            if (b == 0) {
                System.out.println("D");
            } else if (b == 1) {
                System.out.println("C");
            } else if (b == 2) {
                System.out.println("B");
            } else if (b == 3) {
                System.out.println("A");
            } else {
                System.out.println("E");
            }
        }

    }
}
