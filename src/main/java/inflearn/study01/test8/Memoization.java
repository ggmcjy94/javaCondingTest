package inflearn.study01.test8;

import java.util.Scanner;

/**
 * 조합의 경우수(메모이제이션) (n-1 C r-1) +  (n-1 C r)
 */
public class Memoization {
    int[][] dy = new int[35][35];
    private int DFS(int n, int r) {
        if (dy[n][r] > 0) return dy[n][r];
        if (n == r || r == 0) return 1;
        else {
            return dy[n][r]=DFS(n-1, r-1) + DFS(n-1, r);
        }
    }

    public static void main(String[] args) {
        Memoization T = new Memoization();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int r = kb.nextInt();
        System.out.println(T.DFS(n ,r));
    }


}
