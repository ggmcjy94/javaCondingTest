package fastcampus.chapter3.topological_sort;

import java.util.*;

public class 줄세우기 {
    static int N , M;
    static ArrayList<Integer>[] adj;
    static int[] indeg;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();
        adj = new ArrayList[N + 1];
        indeg = new int[N+1];
        for (int i = 1; i <= N; i++) {
            adj[i] = new ArrayList<>();
        }
        for (int i = 0; i < M; i++) {
            int x = sc.nextInt(), y = sc.nextInt();
            adj[x].add(y);
            indeg[y]++;
        }
        pro();
    }
    static void pro() {
        Deque<Integer> queue = new LinkedList<>();
        for (int i = 1; i <= N; i++) {
            if (indeg[i] == 0)queue.add(i);
        }
        while (!queue.isEmpty()) {
            int x = queue.poll();
            System.out.print(x);
            System.out.print(" ");
            for (int y : adj[x]) {
                indeg[y]--;
                if (indeg[y] == 0) queue.add(y);
            }
        }
    }
}

