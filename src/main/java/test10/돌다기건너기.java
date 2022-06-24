package test10;

import java.util.Scanner;

public class 돌다기건너기 {

    static int[] dy;
    // 개울을 다건너 야되서
    // 1 2 3 5 8 13 21 34 임

    private int solution(int n) {
        dy[1] = 1;
        dy[2] = 2;
        for (int i = 3; i <= n+1; i++) {
            dy[i] = dy[i-2] + dy[i-1];
        }
        return dy[n+1];
    }

    public static void main(String[] args) {
        돌다기건너기 T = new 돌다기건너기();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        dy = new int[n+2];
        System.out.println(T.solution(n));

    }


}
