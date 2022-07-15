package back.dfs_bfs;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class 바이러스 {
    static int map[][];
    static boolean visit[];
    static int n , m;
    static int count = 0;
    private static int DFS(int i) {
        visit[i] = true;
        for (int j = 1; j <= n; j++) {
            if (map[j][i] == 1 && visit[j] == false) {
                count++;
                DFS(j);
            }
        }
        return count;
     }

    private static int BFS(int i) {
        Queue<Integer> q = new LinkedList<>();
        q.offer(i);
        visit[i] = true;
        while (!q.isEmpty()) {
            int temp = q.poll();
            for (int k = 1; k <= n; k++) {
                if (map[temp][k] == 1 && visit[k] == false) {
                    q.offer(k);
                    visit[i] = true;
                    count++;
                }
            }
        }
        return count;
    }



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        map = new int[n+1][n+1];
        visit = new boolean[n+1];
        for (int i =0; i < m; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            map[a][b] = map[b][a] = 1;
        }
        System.out.println(DFS(1));
        sc.close();
    }




}
