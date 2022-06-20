package test07;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 * 그래프 최단거리 (BFS) 최단거리는 BFS
 */

/**
6 9
1 3
1 4
2 1
2 5
3 4
4 5
4 6
6 2
6 5
 */
public class GraphShortestDistance2 {
    static int n, m, answer =0;
    static ArrayList<ArrayList<Integer>> graph;
    static int[] ch, dis;

    private void BFS(int v) {
        Queue<Integer> Q = new LinkedList<>();
        ch[v] = 1;
        dis[v] = 0;
        Q.offer(v);
        while (!Q.isEmpty()) {
            int cv = Q.poll();
            for (int nv : graph.get(cv)) {
                if (ch[nv] == 0) {
                    ch[nv]  = 1;
                    Q.offer(nv);
                    dis[nv] = dis[cv] + 1;
                }
            }
        }


    }
    public static void main(String[] args) {
        GraphShortestDistance2 T = new GraphShortestDistance2();
        Scanner kb = new Scanner(System.in);
        n = kb.nextInt();
        m = kb.nextInt();
       graph = new ArrayList<ArrayList<Integer>>();
       for (int i = 0; i <= n; i++) {
           graph.add(new ArrayList<Integer>());
       }

       ch = new int[n+1];
       dis = new int[n+1];

       for (int i = 0; i < m; i++) {
           int a = kb.nextInt();
           int b = kb.nextInt();
           graph.get(a).add(b);
       }
       T.BFS(1);
       for (int i = 2; i <= n; i++) {
           System.out.println(i + " : " + dis[i]);
       }
    }


}
