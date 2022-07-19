package programmers.level2;

public class 게임맵최단거리 {
    int[] dx = {-1, 0 ,1, 0};
    int[] dy = {0 ,1, 0 ,-1};
    boolean[][] visited;
    int min;
    private void DFS(int x, int y, int[][] maps, int cnt) {
        cnt++;
        if (x == maps.length -1 && y == maps[0].length -1) {
            min = Math.min(cnt, min);
            return;
        }
        for (int i = 0; i < 4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];
            if (nx < 0 || ny < 0 || nx >= maps.length || ny >= maps[0].length) continue;
            if (visited[nx][ny] == false && maps[nx][ny] == 1) {
                visited[nx][ny] = true;
                DFS(nx, ny, maps, cnt);
                visited[nx][ny] = false;
            }
        }
    }
    public int solution(int[][] maps) {
        min = Integer.MAX_VALUE;
        visited = new boolean[maps.length][maps[0].length];
        DFS(0,0,maps,0);
        if (min == Integer.MAX_VALUE) return -1;
        return min;
    }


}
