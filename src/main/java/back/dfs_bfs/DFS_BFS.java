package back.dfs_bfs;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class DFS_BFS {
    static int[][] arr;
    static boolean[] visited;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int v = sc.nextInt();

        arr = new int[n+1][n+1];
        for (int i = 0; i < m; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            arr[a][b] = 1;
            arr[b][a] = 1;
        }

        visited = new boolean[n + 1];
        dfs(v);
        System.out.println();
        visited = new boolean[n + 1];
        bfs(v);
    }
    private static void dfs(int v) { //
        visited[v] = true;
        System.out.print(v + " ");

        if (v == arr.length) {
            return;
        }
        for (int j = 1; j < arr.length; j++) {
            if (arr[v][j] == 1 && visited[j] == false) {
                dfs(j);
            }
        }
    }
    private static void bfs(int v) {
        Queue<Integer> que = new LinkedList<>();
        que.add(v);
        visited[v] = true;
        System.out.print(v + " ");
        while (!que.isEmpty()) {
            int temp = que.poll();

            for (int i = 1; i < arr.length; i++) {
                if (arr[temp][i] == 1 && visited[i] == false) {
                    que.add(i);
                    visited[i] = true;
                    System.out.print(i + " ");
                }
            }
        }
    }
}
