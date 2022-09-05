package fastcampus.chapter3.graph_search.bfs;

import java.util.LinkedList;
import java.util.Queue;

public class BExam {

    static boolean[] visit;

    //start 에서 시작해서 갈 수 있는 정점들을 모두 탐색
    static void bfs(int start) {
        Queue<Integer> que = new LinkedList<>();

        // start는 방문 가능한 점입로 que 에 넣어 줌
        que.add(start);
        visit[start] = true; //start 를 갈 수 있다고 표시하기 (중요!!!)

        while(!que.isEmpty()) { // 더 확인할 점이 없다면 정지
            Integer x = que.poll();
            for (int y=0; y < x; y++) { // for (int y: x 에서 갈 수 있는 점들)
                if (visit[y]) continue; // x 에서 y 를 갈 수는 있지만 이미 탐색한 점이면 무시
                // y 를 갈 수 있으니깐 que에 추가하고 ,visit 처리하기
                que.add(y);
                visit[y]= true;
            }
        }
    }

}
