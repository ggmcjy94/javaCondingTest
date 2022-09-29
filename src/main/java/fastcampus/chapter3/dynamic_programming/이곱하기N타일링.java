package fastcampus.chapter3.dynamic_programming;

import java.util.Scanner;

public class 이곱하기N타일링 {
    static int N;
    static int[] Dy;

    static void pro() {
        Dy = new int[1005];
        //초기값
        Dy[1] = 1;
        Dy[2] = 2;

        //점화식
        for (int i = 3; i <= N; i++) {
            Dy[i] = (Dy[i - 1] + Dy[i - 2]) % 10007;
        }
        System.out.println(Dy[N]);
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        pro();

    }
}
