package fastcampus.chapter3.graph_search.bfs;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class 숨바꼭질 {


    static int N, K;
    static int[] dist;
    static boolean[] visit;

    // 숨바꼭질 시작~
    static void bfs() {
        Queue<Integer> Q = new LinkedList<>();
        Q.add(N);
        visit[N] = true;
        dist[N] = 0;
        // BFS 과정 시작
        while (!Q.isEmpty()) {
            int x = Q.poll();
            if (x - 1 >= 0 && !visit[x - 1]) {
                visit[x - 1] = true;
                dist[x - 1] = dist[x] + 1;
                Q.add(x - 1);
            }
            if (x + 1 <= 100000 && !visit[x + 1]) {
                visit[x + 1] = true;
                dist[x + 1] = dist[x] + 1;
                Q.add(x + 1);
            }
            if (x * 2 <= 100000 && !visit[x * 2]) {
                visit[x * 2] = true;
                dist[x * 2] = dist[x] + 1;
                Q.add(x * 2);
            }
        }
    }

    static void pro() {
        bfs();
        System.out.println(dist[K]);
    }


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        K = sc.nextInt();
        visit = new boolean[100005];
        dist = new int[100005];
        pro();
    }


}
