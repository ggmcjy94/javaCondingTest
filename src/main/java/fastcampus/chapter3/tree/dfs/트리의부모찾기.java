package fastcampus.chapter3.tree.dfs;

import java.util.ArrayList;
import java.util.Scanner;

public class 트리의부모찾기 {

    static int n;
    static ArrayList<Integer>[] adj;
    static int[] parent;

    static void dfs(int x, int par) {
        for (int y: adj[x]) {
            if (y == par) continue;
            parent[y] = x;
            dfs(y, x);
        }
    }

    static void pro() {
        dfs(1, -1);
        for (int i = 2; i<=n;i++) {
            System.out.println(parent[i]);
        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        adj = new ArrayList[n + 1];
        parent = new int[n + 1];
        for (int i = 1; i <= n; i++) adj[i] = new ArrayList<>();
        for (int i = 1; i < n; i++) {
            int x = sc.nextInt() , y = sc.nextInt();
            adj[x].add(y);
            adj[y].add(x);
        }
        pro();
    }
}
