package inflearn.study01.test8;

import java.util.Scanner;

/**
 * 조합 구하기
 */
public class 조합구하기 {

    static int[] combi;
    static int n , m;

    private void DFS (int L, int s) {
        if (L == m) {
            for (int x : combi) System.out.print(x + " ");
            System.out.println();
        } else {
            for (int i = s; i <= n; i++) {
                combi[L] = i; // 1 2
                DFS(L+1, i + 1);
            }
          }
    }

    public static void main(String[] args) {
        조합구하기 T = new 조합구하기();
        Scanner kb = new Scanner(System.in);
        n = kb.nextInt();
        m = kb.nextInt();
        combi = new int[m];
        T.DFS(0 , 1);
    }
}
