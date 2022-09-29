package fastcampus.chapter3.dynamic_programming;

import java.util.Scanner;

public class 피보나치수01 {

    static int[] Dy;
    static int N;

    static void pro() {
        if (N < 2) {
            System.out.println(N);
            return;
        }
        Dy = new int[N+1];
        Dy[0] = 0;
        Dy[1] = 1;
        for (int i = 2; i <= N; i++) {
            Dy[i] = Dy[i-2] + Dy[i-1];
        }
        System.out.println(Dy[N]);
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        pro();
    }
}
