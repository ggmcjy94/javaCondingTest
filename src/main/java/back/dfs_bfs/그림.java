package back.dfs_bfs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class 그림 {
    static int[][] map;
    static boolean[][] visited;
    static int[][] pos = {{0,-1},{0,1},{1,0},{-1,0}};
    static int count =0;
    static int N, M;


    static void dfs(int x, int y) {
        visited[x][y] = true;
        count++;

        for (int i = 0; i < 4; i++) {
            int nx = x + pos[i][0];
            int ny = y + pos[i][1];

            if (nx >= 0 && nx < N  && ny >=0 && ny < M && !visited[nx][ny] && map[nx][ny] == 1) {
                dfs(nx, ny);
            }
        }
    }



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();
        boolean zero = true;
        List<Integer> list = new ArrayList<Integer>();

        map = new int[N][M];
        visited = new boolean[N][M];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                map[i][j] = sc.nextInt();
                if (map[i][j] == 1) {
                    zero = false;
                }
            }
        }

        if (zero) {
            return;
        }

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                count = 0;
                if (!visited[i][j] && map[i][j] == 1) {
                    dfs(i,j);
                    list.add(count);
                }
            }
        }
        Collections.sort(list);
        System.out.println(list.size());
        System.out.println(list.get(list.size() - 1));
    }

}
