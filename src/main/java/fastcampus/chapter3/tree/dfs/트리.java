package fastcampus.chapter3.tree.dfs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class 트리 {

    static int n, root, erased;
    static ArrayList<Integer>[] child;
    static int[] leaf;


    static void dfs(int x) {
        if (child[x].isEmpty()) {
            leaf[x] = 1;
        }
        for (int y : child[x]){
            dfs(y);
            leaf[x] += leaf[y];
        }
    }

    static void pro() {
        for (int i = 0; i < n; i++) {
            if (child[i].contains(erased)) {
                child[i].remove(child[i].indexOf(erased));
            }
        }
        if (root != erased) dfs(root);
        System.out.println(leaf[root]);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        child = new ArrayList[n];
        leaf = new int[n];
        for (int i = 0; i < n; i++) child[i] = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int par = sc.nextInt();
            if (par == -1){
                root = i;
                continue;
            }
            child[par].add(i);
        }
        erased = sc.nextInt();
        pro();
    }
}
