package fastcampus.chapter3.graph_search.dfs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class 단지번호붙히기 {

    static int N, group_cnt;
    static String[] a;
    static boolean[][] visited;
    static int[][] dir = {{1,0}, {0,1}, {-1,0},{0,-1}};
    static ArrayList<Integer> group;

    static void dfs (int x , int y) {
        group_cnt++;
        visited[x][y] =true;

        for (int k = 0; k < 4; k++) {
            int nx = x + dir[k][0];
            int ny = y + dir[k][1];
            if (nx < 0 || ny <0 || ny >= N || nx >= N) continue;
            if (a[nx].charAt(ny) == '0') continue;
            if (visited[nx][ny]) continue;
            dfs(nx , ny);

        }
    }

    static void pro() {
        group = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (!visited[i][j] && a[i].charAt(j) == '1') {
                    group_cnt = 0;
                    dfs(i, j);
                    group.add(group_cnt);
                }
            }
        }
        Collections.sort(group);
        System.out.println(group.size());
        for (Integer i : group) {
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        a = new String[N];
        for (int i = 0; i < N; i++) {
            a[i] = sc.next();
        }
        visited = new boolean[N][N];
        pro();
    }
}
