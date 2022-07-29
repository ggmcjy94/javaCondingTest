package inflearn.study01.test07;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * 경로탐색 (인접리스트)
 */
public class AdjacencyList {
    static int n ,m , answer = 0;
    static ArrayList<ArrayList<Integer>> graph;
    static int[] ch;

    public void DFS(int v) {
        if (v == n) answer++;
        else {
            for (int nv : graph.get(v)) {
                if (ch[nv] == 0) {
                    ch[nv] = 1;
                    DFS(nv);
                    ch[nv] = 0;
                }
            }
        }
    }

    public static void main(String[] args) {
        AdjacencyList T = new AdjacencyList();
        Scanner kb = new Scanner(System.in);
        n = kb.nextInt();
        m = kb.nextInt();
        graph = new ArrayList<ArrayList<Integer>>();
        for (int i = 0; i <= n; i++) { // 0 에서 객체 생성
            graph.add(new ArrayList<Integer>());
        }
        ch = new int[n+1];
        for (int i = 0; i < m; i++) {
            int a = kb.nextInt();
            int b = kb.nextInt();
            graph.get(a).add(b);
        }
        ch[1] = 1;
        T.DFS(1);
        System.out.println(answer);


    }
}
