package back.dfs_bfs;

import java.util.Scanner;

public class _04_알파벳 {

    static int R,C;
    static int[][] map;
    static boolean[] visited = new boolean[26];
    static int[] dx = {-1, 0, 1, 0};
    static int[] dy = {0, 1, 0 , -1};
    static int max = 0;

    private static void DFS(int x, int y, int len) {
        visited[map[x][y]] = true;
        max = Math.max(max, len);
        for (int i = 0; i <4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];
            if (nx >= 0 && nx < R && ny >= 0 && ny < C) {
                if (!visited[map[nx][ny]]) {
                    DFS(nx, ny, len + 1);
                    visited[map[nx][ny]] = false;
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        R = sc.nextInt();
        C = sc.nextInt();
        sc.nextLine();
        map = new int[R][C];
        for (int i = 0; i < R; i++) {
            String str = sc.nextLine();
            for (int j = 0; j < C; j++) {
                map[i][j] = str.charAt(j) - 'A';
            }
        }
        DFS(0,0,1);
        System.out.println(max);
    }


}
