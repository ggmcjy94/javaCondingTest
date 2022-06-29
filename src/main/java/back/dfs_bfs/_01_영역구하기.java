package back.dfs_bfs;

import java.util.ArrayList;
import java.util.Scanner;

public class _01_영역구하기 {
    static int count = 0;

    private static void DFS(int[][] arr, int x, int y) {
        arr[x][y] = 1;
        count++;
        int[] dx = {-1, 0 , 1, 0};
        int[] dy = {0 , 1, 0 , -1};
        for (int i = 0; i < 4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];

            if (nx >= 0 && nx < arr.length && ny >= 0 && ny < arr[0].length && arr[nx][ny] == 0) {
                DFS(arr, nx, ny);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int k = sc.nextInt();

        int arr[][] = new int[n][m];

        for (int i = 0; i < k; i++) {
            int lx = sc.nextInt();// 0 1 4
            int ly = sc.nextInt(); // 2 1 0
            int rx = sc.nextInt();// 4 2 6
            int ry = sc.nextInt();//4 5 2

            for (int y = ly; y < ry; y++) { // 2 3
                for (int x = lx; x < rx; x++) { // 0 1 2 3
                    arr[y][x] = 1;
                }
            }
        }
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (arr[i][j] == 0) {
                    DFS(arr, i, j);
                    if (count != 0) {
                        list.add(count);
                        count = 0;
                    }
                }
            }
        }
        list.sort(null);
        System.out.println(list.size());
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
    }


}
