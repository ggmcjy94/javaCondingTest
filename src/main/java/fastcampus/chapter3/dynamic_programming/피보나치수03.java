package fastcampus.chapter3.dynamic_programming;

import java.util.Scanner;

public class 피보나치수03 {

    static Long[] Dy;
    static Long N;

    static void pro() {
        Dy = new Long[1500000];
        Dy[0] = 0L;
        Dy[1] = 1L;
        for (int i = 2; i<1500000 &&i <= N; i++) {
            Dy[i] = (Dy[i-2] + Dy[i-1]) % 1000000;
        }
        if (N >= 1500000) {
            N %= 1500000;
        }
        System.out.println(Dy[Math.toIntExact(N)]);
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextLong();
        pro();
    }
}
