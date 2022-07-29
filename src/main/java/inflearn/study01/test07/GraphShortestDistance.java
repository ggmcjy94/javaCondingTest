package inflearn.study01.test07;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 * 그래프 최단거리 (BFS) 최단거리는 BFS
 */
public class GraphShortestDistance {
    static int n, m;
    static int[] answer;
    static boolean[] ch;
    static ArrayList<ArrayList<Integer>> graph;


    private void BFS(int v) {
        Queue<Integer> Q = new LinkedList<>();
        Q.offer(v);
        ch[v] = true;
        int L = 0;
        while (!Q.isEmpty()) {
            int len = Q.size();
            for (int i = 0; i < len; i++) {
                int nv = Q.poll();
                answer[nv] = L;
                for (int x : graph.get(nv)) {
                    if (!ch[x]) {
                        Q.offer(x);
                        ch[x] = true;
                    }
                }
            }
            L++;
        }
    }
    public static void main(String[] args) {
        GraphShortestDistance T = new GraphShortestDistance();
        Scanner kb = new Scanner(System.in);
        n = kb.nextInt();
        m = kb.nextInt();
        answer = new int[n+1];
        ch = new boolean[n+1];
        graph = new ArrayList<ArrayList<Integer>>();
        for (int i = 0; i <= n; i++){
            graph.add(new ArrayList<Integer>());
        }

        for (int i = 0; i < m; i++){
            int x = kb.nextInt();
            int y = kb.nextInt();
            graph.get(x).add(y);
        }
        T.BFS(1);
        for (int i = 2; i < answer.length; i++) {
            System.out.println(i + " : " + answer[i]);
        }
    }


}
