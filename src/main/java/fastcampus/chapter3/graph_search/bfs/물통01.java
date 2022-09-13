package fastcampus.chapter3.graph_search.bfs;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class 물통01 {

    static class State {
        int[] X;

        public State(int[] x) {
            this.X = new int[3];
            for (int i = 0; i < 3; i++) this.X[i] = x[i];
        }

        State move(int from , int to , int[] Limit) {
            int[] nX = new int[]{this.X[0], this.X[1], this.X[2]};
            if (this.X[from] + this.X[to] >= Limit[to]) {
                nX[from] -= Limit[to] - this.X[to];
                nX[to] = Limit[to];
            } else {
                nX[to] += nX[from];
                nX[from] = 0;
            }
            return new State(nX);
        }
    }

    static int[] Limit;
    static boolean[] possible;
    static boolean[][][] visit;

    static void bfs(int x1, int x2, int x3) {
        Queue<State> Q = new LinkedList<>();
        visit[x1][x2][x3] = true;
        Q.offer(new State(new int[]{x1,x2,x3}));
        
        while(!Q.isEmpty()) {
            State st = Q.poll();
            if (st.X[0] == 0) possible[st.X[2]] = true;
            for (int from=0; from<3; from++) {
                for (int to = 0; to<3; to++) {
                    if (from == to) continue;
                    State nxt = st.move(from, to, Limit);

                    if (!visit[nxt.X[0]][nxt.X[1]][nxt.X[2]]) {
                        visit[nxt.X[0]][nxt.X[1]][nxt.X[2]] = true;
                        Q.offer(nxt);
                    }
                }
            }
        }
    }
    static void pro() {
        bfs(0,0,Limit[2]);
        for (int i=0; i<=Limit[2]; i++) {
            if (possible[i]) {
                System.out.print(i);
                System.out.print(" ");
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Limit = new int[3];
        for (int i = 0; i <3; i++) Limit[i] = sc.nextInt();
        visit = new boolean[205][205][205];
        possible = new boolean[205];
        pro();
    }


}
