package inflearn.study01.test07;

import java.util.Scanner;

/**
 * 피보나치재귀 (메모이제이션)
 */
public class Recursive04 {
    static int[] fibo;

    private int DFS(int n) {
        if (n == 1) return 1;
        else if (n == 2) return 1;
        else return DFS(n - 2) + DFS(n - 1);
    }

    private int DFS1(int n) {
        if (n == 1) return fibo[n] = 1;
        else if (n == 2) return fibo[n] = 1;
        else return fibo[n] = DFS1(n - 2) + DFS1(n - 1);
    }

    private int DFS2(int n) {
        if (fibo[n] > 0) return fibo[n];
        if (n == 1) return fibo[n] = 1;
        else if (n == 2) return fibo[n] = 1;
        else return fibo[n] = DFS2(n - 2) + DFS2(n - 1);
    }

    public static void main(String[] args) {
        Recursive04 recursive01 = new Recursive04();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        fibo = new int[n + 1];
        recursive01.DFS2(n);
        for (int i = 1; i <= n; i++) System.out.print(fibo[i] + " ");

//        for (int i = 1; i <= n; i++) {
//            System.out.print(recursive01.dfs_bfs(i) + " ");
//        }
    }





}
