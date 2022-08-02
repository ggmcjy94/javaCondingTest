package programmers.level2;

import java.util.LinkedList;
import java.util.Queue;


class DisPont {
    int x , y;

    public DisPont(int x, int y) {
        this.x = x;
        this.y = y;
    }
}
public class 거리두기확인하기 {

    public int[] solution(String[][] places) {
        int[] answer = new int[places.length];
        for (int i = 0; i < places.length; i++) {
            String[] p = places[i];
            boolean isOk = true;

            for (int r=0; r<5 && isOk; r++) {
                for (int c = 0; c < 5 && isOk; c++) {
                    if (p[r].charAt(c) == 'P') {
                        if (bfs(r, c , p) == false) {
                            isOk = false;
                        }
                    }
                }
            }
            answer[i] = isOk ? 1 : 0;
        }
        return answer;
    }

    private boolean bfs(int r, int c, String[] p) {
        int dr[] = {-1, 0, 1, 0};
        int dc[] = {0, 1, 0 , -1};
        Queue<DisPont> Q = new LinkedList<>();
        Q.offer(new DisPont(r, c));

        while (!Q.isEmpty()) {
            DisPont poll = Q.poll();
            for (int i = 0; i < 4; i++) {
                int nr = poll.x + dr[i];
                int nc = poll.y + dc[i];
                if (nr < 0 || nc < 0 || nr >=5 || nc >= 5 || (nr == r && nc == c))
                    continue;

                int d = Math.abs(nr - r) + Math.abs(nc - c);

                if (p[nr].charAt(nc) == 'P' && d <= 2) {
                    return false;
                } else if (p[nr].charAt(nc) == 'O' && d < 2) {
                    Q.offer(new DisPont(nr, nc));
                }
            }
        }
        return true;
    }
}
