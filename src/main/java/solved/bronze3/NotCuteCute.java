package solved.bronze3;

import java.util.Scanner;

public class NotCuteCute {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int c = 0;
        int nc = 0;
        for (int i = 0; i < N; i++) {
            int l = sc.nextInt();
            if (l == 0) {
                nc++;
            } else {
                c++;
            }
        }

        if (c < nc) {
            System.out.println("Junhee is not cute!");
        } else {
            System.out.println("Junhee is cute!");
        }
    }
}
