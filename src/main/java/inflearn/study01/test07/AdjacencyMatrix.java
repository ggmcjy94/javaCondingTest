package inflearn.study01.test07;

import java.util.Scanner;

/**
 * 경로탐색 (인접행렬)
 */
public class AdjacencyMatrix {
    static int n,m, answer = 0;
    static int[][] graph;
    static int[] ch;
    public void DFS(int v) {
        if (v == n) answer++;
        else {
            for (int i = 1; i <= n; i++) {
                if (graph[v][i] == 1 && ch[i] == 0) {
                    ch[i] = 1;
                    DFS(i);
                    ch[i] = 0;
                }
            }
        }

    }

    public static void main(String[] args) {
        AdjacencyMatrix T = new AdjacencyMatrix();
        Scanner kb = new Scanner(System.in);
        n = kb.nextInt();//노드
        m = kb.nextInt();//간선
        graph = new int[n+1][n+1]; //[1~n][1~n]
        ch = new int[n+1];
        for (int i = 0; i < m; i++) {
            int a = kb.nextInt();
            int b = kb.nextInt();
            graph[a][b] = 1;
        }
        ch[1] = 1;
        T.DFS(1);
        System.out.println(answer);
    }
}
