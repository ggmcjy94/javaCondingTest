package back.dfs_bfs;

import java.util.*;

class Pos {
    int x;
    int y;

    public Pos(int x, int y) {
        this.x = x;
        this.y = y;
    }
}
public class _01_1_영역구하기 {
    static int m,n,k;
    static int[][] arr;
    static ArrayList<Integer> answer = new ArrayList<>();
    static boolean[][] visited;

    private static void BFS(int x, int y) {
        Queue<Pos> q = new LinkedList<>();
        int[] dx = {-1, 0 , 1, 0};
        int[] dy = {0, 1, 0 , -1};
        int cnt = 0;

        q.offer(new Pos(x, y));

        while(!q.isEmpty()) {
            Pos temp = q.poll();
            for (int i =0; i<4; i++) {
                int nx = temp.x + dx[i];
                int ny = temp.y + dy[i];

                if (nx >= 0 && nx < m && ny >= 0 && ny < n) {
                    if (arr[nx][ny] == 0 && !visited[nx][ny])
                        visited[nx][ny] = true;
                        q.offer(new Pos(nx, ny));
                        cnt++;
                }
            }
        }
        if (cnt == 0) {
            answer.add(cnt + 1);
        } else {
            answer.add(cnt);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        m = sc.nextInt();
        n = sc.nextInt();
        k = sc.nextInt();

        arr = new int[m][n];

        for (int t = 0; t < k; t++) {
            int x1 = sc.nextInt();
            int y1 = sc.nextInt();
            int x2 = sc.nextInt();
            int y2 = sc.nextInt();

            for (int y = y1; y < y2; y++) {
                for (int x = x1; x < x2; x++) {
                    arr[y][x] = 1;
                }
            }
            visited = new boolean[m][n];
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    if (arr[i][j] == 0 && !visited[i][j]) {
                        BFS(i, j);
                    }
                }
            }
        }

        Collections.sort(answer);
        System.out.println(answer.size());
        for (int i = 0; i < answer.size(); i++) {
            System.out.print(answer.get(i) + " ");
        }
    }
}
