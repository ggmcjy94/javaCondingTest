package fastcampus.chapter3.graph_search;

import java.util.*;

public class DFS와BFS {
    static int N, M, V;
    static boolean[] visited;
//    static int[][] adj;// 인접 행렬
    static ArrayList<Integer>[] adj; // 인접 리스트

    static void dfs(int x) {
        visited[x] = true;
        System.out.print(x);
        System.out.print(' ');
//        for (int y = 1; y <= N; y++) {
//            if (adj[x][y] == 0) continue;
//            if (visited[y]) continue;
//            dfs(y);
//        }
        for (int y : adj[x]) {
            if (visited[y]) continue;
            dfs(y);
        }
    }

    static void bfs(int x) {
        Queue<Integer> que = new LinkedList<>();
        que.add(x);
        visited[x] = true;
        
        while (!que.isEmpty()) {
            x = que.poll();
            System.out.print(x);
            System.out.print(' ');
//            for (int y = 1; y <= N; y++) {
//                if (adj[x][y] == 0) continue;
//                if (visited[y]) continue;
//                que.add(y);
//                visited[y] = true;
//            }
            for (int y : adj[x]) {
                if (visited[y]) continue;
                que.add(y);
                visited[y] = true;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();
        V = sc.nextInt();

//        adj = new int[N+1][N+1];
//        for (int i = 1; i <= M; i++) {
//            int x= sc.nextInt(), y = sc.nextInt();
//            adj[x][y] = 1;
//            adj[y][x] = 1;
//        }

        adj = new ArrayList[N+1];
        for (int i = 1; i <= N; i++) {
            adj[i] = new ArrayList<>();
        }
        for (int i = 1; i <= M; i++) {
            int x= sc.nextInt(), y = sc.nextInt();
            adj[x].add(y);
            adj[y].add(x);
        }
        for (int i = 1; i <= N; i++) {
            Collections.sort(adj[i]);
        }

        visited = new boolean[N + 1];
        dfs(V);
        System.out.println();
        for (int i = 1; i <= N; i++) visited[i] = false;
        bfs(V);

    }

}
