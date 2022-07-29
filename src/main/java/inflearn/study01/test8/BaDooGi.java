package inflearn.study01.test8;

import java.util.Scanner;

/**
 * 바둑이 승차 (dfs_bfs) 부분집합
 */
public class BaDooGi {
    static int answer = Integer.MIN_VALUE, c, n;

    private void DFS(int L, int sum, int[] arr) {
        if (sum > c) return;
        if (L == n) {
            answer = Math.max(answer, sum);
        } else {
            DFS(L+1, sum + arr[L], arr); //부분집합
            DFS(L+1, sum, arr);  //부분집합
        }
    }


    public static void main(String[] args) {
        BaDooGi T = new BaDooGi();
        Scanner kb = new Scanner(System.in);
        c = kb.nextInt();
        n= kb.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = kb.nextInt();
        }
        T.DFS(0,0,arr);
        System.out.println(answer);

    }


}
