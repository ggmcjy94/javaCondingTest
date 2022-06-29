package back.dfs_bfs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class _02_단지번호붙이기 {
    static int n,cnt;
    static int[][] map;
    static int[][] visited;
    static int[] dx = {-1,0,1,0};
    static int[] dy = {0,1,0,-1};
    static ArrayList<Integer> al = new ArrayList<>();

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        n = sc.nextInt();
        map = new int[n][n];
        visited = new int[n][n];


        for (int i = 0; i < n; i++) {
            String input = sc.next();
            for (int j = 0; j < n; j++) {
                map[i][j] = input.charAt(j) - '0';
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (map[i][j] == 1 && visited[i][j] == 0) {
                    cnt = 1;
                    DFS(i,j);
                    al.add(cnt);
                }
            }
        }
        Collections.sort(al);
        System.out.println(al.size());
        for (int i = 0; i < al.size(); i++) {
            System.out.println(al.get(i));
        }
    }

    private static void DFS(int x, int y) {
        visited[x][y] = 1;
        for (int i = 0; i < 4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];

            if (nx >= 0 && nx < n && ny >= 0 && ny < n) {
                if (map[nx][ny] == 1 && visited[nx][ny] == 0) {
                    DFS(nx, ny);
                    cnt++;
                }
            }
        }
    }
}
