package inflearn.study01.test8;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 * 토마토(BFS)
 */
//class Point {
//    int x, y;
//
//    public Point(int x, int y) {
//        this.x = x;
//        this.y = y;
//    }
//}
public class 토마토 {
    static int[] dx = {-1,0,1,0};
    static int[] dy = {0,1,0,-1};
    static int n,m;
    static int[][] board, dis;
    static Queue<Point> Q = new LinkedList<>();

    private void BFS() {
        while (!Q.isEmpty()) {
            Point tmp = Q.poll();
            for (int i = 0; i < 4; i++) { // 네방향
                int nx = tmp.x + dx[i];
                int ny = tmp.y + dy[i];
                if (nx >= 0 && nx < n && ny >= 0 && ny < m && board[nx][ny] == 0) {
                    board[nx][ny] = 1;
                    Q.offer(new Point(nx, ny));
                    dis[nx][ny] = dis[tmp.x][tmp.y] + 1;
                }
            }
        }
    }

    public static void main(String[] args) {
        토마토 T = new 토마토();
        Scanner kb = new Scanner(System.in);
        m = kb.nextInt();
        n = kb.nextInt();
        dis = new int[n][m];
        board = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                board[i][j] = kb.nextInt();
                if (board[i][j]==1) Q.offer(new Point(i, j)); // 1 체크 후 q 쌓기 그럼 여기가 0레벨
            }
        }
        T.BFS();
        boolean flag = true;
        int answer = Integer.MIN_VALUE;
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < m; j++) {
                if (board[i][j] == 0) flag = false;
            }
        }
        if (flag) {
            for(int i = 0; i < n; i++) {
                for(int j = 0; j < m; j++) {
                    answer = Math.max(answer, dis[i][j]);
                }
            }
            System.out.println(answer);
        } else {
            System.out.println(-1);
        }
    }


}
