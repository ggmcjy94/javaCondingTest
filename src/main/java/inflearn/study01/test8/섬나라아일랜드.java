package inflearn.study01.test8;

import java.util.Scanner;

/**
 * 섬나라 아일랜드 (dfs_bfs)
 */
public class 섬나라아일랜드 {
    static int[] dx = {-1,-1,0,1,1,1,0,-1};
    static int[] dy = {0,1,1,1,0,-1,-1,-1};
    static int n, answer = 0;
    private void DFS(int x, int y, int[][] board) {
        for (int i = 0; i < 8; i++) {//상하좌우 대각선
            int nx = x + dx[i];
            int ny = y + dy[i];
            if (nx >=0 && nx < n && ny >= 0 && ny < n && board[nx][ny] == 1) {
                board[nx][ny] = 0; // 거친곳을 바다로
                DFS(nx , ny , board);
            }
        }
    }

    private void solution(int[][] board) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (board[i][j] == 1) {
                    answer++;
                    board[i][j] = 0; //출발점 을 바다로
                    DFS(i, j, board);
                }
            }
        }
    }
    public static void main(String[] args) {
        섬나라아일랜드 T = new 섬나라아일랜드();
        Scanner kb = new Scanner(System.in);
        n = kb.nextInt();
        int [][] arr = new int[n][n];
        for (int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                arr[i][j] = kb.nextInt();
            }
        }
        T.solution(arr);
        System.out.println(answer);
    }



}
