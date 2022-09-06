package fastcampus.chapter3.graph_search.bfs;

import java.util.*;


public class 단지번호붙히기02 {

    static int N, group_cnt;
    static String[] a;
    static boolean[][] visited;
    static int[][] dir = {{1,0},{0, 1},{-1, 0},{0 , -1}};
    static ArrayList<Integer> group;

    static class Point {
        int x , y;

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }


    static void bfs(int x, int y) {
        Queue<Point> que = new LinkedList<>();
        que.add(new Point(x, y));
        visited[x][y] = true;
        while (!que.isEmpty()) {
            Point point = que.poll();
            group_cnt++;
            for (int k = 0; k < 4; k++) {
                int nx = point.x + dir[k][0];
                int ny = point.y + dir[k][1];
                if (nx < 0 || ny < 0 || nx >= N || ny >= N) continue;
                if (a[nx].charAt(ny) == '0') continue;
                if (visited[nx][ny]) continue;
                que.add(new Point(nx, ny));
                visited[nx][ny] = true;
            }
        }
    }
    static void pro() {
        group = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (!visited[i][j] && a[i].charAt(j) == '1') {
                    group_cnt = 0;
                    bfs(i, j);
                    group.add(group_cnt);
                }
            }
        }
        Collections.sort(group);
        System.out.println(group.size());
        for (Integer a : group) {
            System.out.println(a);
        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        a = new String[N];
        visited = new boolean[N][N];
        for (int i = 0; i < N; i++) {
            a[i] = sc.next();
        }
        pro();
    }
}
