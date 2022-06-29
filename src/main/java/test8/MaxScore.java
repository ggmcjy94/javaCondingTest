package test8;

import java.util.Scanner;

/**
 * 최대점수 구하기(dfs_bfs) 부분집합
 */
public class MaxScore {

    static int answer = Integer.MIN_VALUE, n, m;


    private void DFS(int L, int sum, int time, int[] ps, int[] pt) {
        if (time > m) return;
        if (L == n) {
            answer = Math.max(answer, sum);
        } else {
            DFS(L+1, sum + ps[L], time+pt[L], ps,pt);
            DFS(L+1, sum , time, ps, pt);

        }
    }

    public static void main(String[] args) {
        MaxScore T = new MaxScore();
        Scanner kb = new Scanner(System.in);
        n = kb.nextInt();
        m = kb.nextInt();

        int[] a = new int[n];
        int[]b = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = kb.nextInt();
            b[i] = kb.nextInt();
        }
        T.DFS(0,0,0,a,b);
        System.out.println(answer);
    }


}
