package inflearn.study01.test07;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Tree 말단 노드까지의 가장 짧은 경로(dfs_bfs or BFS)
 */

class Node2 {
    int data;
    Node2 lt, rt;

    public Node2(int val) {
        data = val;
        lt=rt=null;
    }
}
public class TreeBestShortPath {
    Node2 root;
    public int DFS(int L, Node2 root) { //dfs_bfs 는 자식이 있으려면 완전히 2개가 있어야된다.
        if (root.lt == null && root.rt == null) return L;
        else return Math.min(DFS(L+1, root.lt), DFS(L+1, root.rt));
    }

    public int BFS(Node2 root) { //레벨 탐색
        Queue<Node2> Q = new LinkedList<>();
        Q.offer(root); //100번지
        int L = 0;
        while (!Q.isEmpty()) {
            int len = Q.size();
            for (int i = 0; i < len; i++) {
                Node2 cur = Q.poll();
                if (cur.lt == null && cur.rt == null) return L;
                if (cur.lt != null) Q.offer(cur.lt);
                if (cur.rt != null) Q.offer(cur.rt);
            }
            L++;
        }
        return 0;
    }


    public static void main(String[] args) {
        TreeBestShortPath tree = new TreeBestShortPath();
        tree.root = new Node2(1); // 0L
        tree.root.lt = new Node2(2); // 1L
        tree.root.rt = new Node2(3); // 1L
        tree.root.lt.lt = new Node2(4); // 2L
        tree.root.lt.rt = new Node2(5); // 2L
        System.out.println(tree.BFS(tree.root));
    }
}
