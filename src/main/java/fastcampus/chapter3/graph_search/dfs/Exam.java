package fastcampus.chapter3.graph_search.dfs;

public class Exam {
    static boolean[] visit;

    // x 를 갈 수 있다는 걸 알고 방문한 상태
    static void dfs(int x) {
        // x 를 방문했다.
        visit[x] = true;
        // x 에서 갈 수 있는 곳들을 모두 방문 한다.;
        for (int y = 0; y < x; y++) {
            if (visit[y]) continue; // y를 이미 갈 수 있다는 사실을 안다면 굳이 갈 필요 없다
            //y에서 갈 수 있는 곳들도 확인 해본다.
            dfs(y);
        }
    }
    public static void main(String[] args) {
        int x = 5;
        visit = new boolean[x+1];
        dfs(x);
    }
}
