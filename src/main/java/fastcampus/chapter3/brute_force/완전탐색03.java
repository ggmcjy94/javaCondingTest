package fastcampus.chapter3.brute_force;


import java.util.Scanner;

//N-Queen 문제
public class 완전탐색03 {

    static  int N, ans;
    static int[] col;

    private static boolean validity_check() {
        for (int i = 1; i <= N; i++) {
            for (int j = 1; j < i; j++) {
                if (attackable(i, col[i], j, col[j])) {
                    return false;
                }
            }
        }
        return true;
    }

    private static boolean attackable(int r1, int c1, int r2, int c2) {
        if (c1 == c2) return true; // 열
        if (r1 - c1 == r2 - c2) return true; // 왼 쪽 위 대각선
        if (r1 + c1 == r2 + c2) return true; // 오른쪽 위 대각선
        return false;
    }

    static void rec_func(int row) {
        if (row == N + 1) {
            ans++;
        } else {
            for (int c = 1; c<=N; c++) {
                boolean possible = true;
                //valid check (row, c)
                for (int i = 1; i<=row-1; i++) {
                    if (attackable(row, c, i , col[i])) {
                        possible = false;
                        break;
                    }
                }
                if (possible) {
                    col[row] = c;
                    rec_func(row + 1);
                    col[row] = 0;
                }

            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        col = new int[N + 1];
        rec_func(1);
        System.out.println(ans);
    }
}
