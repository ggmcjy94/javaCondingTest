package fastcampus.chapter3.dynamic_programming;

import java.util.Scanner;

public class 일이삼더하기 {

    static int[] Dy;


    static void preprocess() {
        Dy = new int[15];
        Dy[1] = 1;
        Dy[2] = 2;
        Dy[3] = 4;

        for (int i = 4; i <= 11; i++) {
            Dy[i] = Dy[i - 1] + Dy[i - 2] + Dy[i - 3];
        }
    }

    public static void main(String[] args) {
        preprocess();
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int tt =1; tt<=T; tt++){
            int N = sc.nextInt();
            System.out.println(Dy[N]);
        }


    }

}
