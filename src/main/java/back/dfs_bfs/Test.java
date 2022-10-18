package back.dfs_bfs;


import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Test {

    static int[][] arr;
    static boolean[] visited;

    static void dfs(int start) {
        visited[start] = true;
        System.out.print(start + " ");
        if (start == arr.length) {
            return;
        }
        for (int j = 1; j < arr.length; j++) {
            if (arr[start][j] == 1 && !visited[j]) {
                dfs(j);
            }
        }
    }

    static void bfs(int start) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(start);
        visited[start] = true;
        System.out.print(start + " ");
        while (!queue.isEmpty()) {
            int temp = queue.poll();
            for (int j = 1; j < arr.length; j++) {
                if (arr[temp][j] == 1 && !visited[j]) {
                    queue.add(j);
                    visited[j] = true;
                    System.out.print(j + " ");
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int start = sc.nextInt();
        arr = new int[n+1][n+1];
        for (int i = 0; i < m; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            arr[a][b] = 1;
            arr[b][a] = 1;
        }

        visited = new boolean[n+1];
        dfs(start);
        System.out.println();
        visited = new boolean[n+1];
        bfs(start);
    }
}
