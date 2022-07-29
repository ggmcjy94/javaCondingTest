package inflearn.study01.test07;


import java.util.LinkedList;
import java.util.Queue;

/**
 * 이진트리 순회 (넓이우선탐색 : 레벨탐색) (BFS)
 */

class Node1 {
    int data;
    Node1 lt, rt;

    public Node1(int val) {
        data = val;
        lt=rt=null;
    }
}

public class BinaryTreeLevelSearch {
    Node1 root;
    public void BFS(Node1 root) {
        Queue<Node1> Q = new LinkedList<>();
        Q.offer(root); // 100번지 객체
        int L = 0;
        while (!Q.isEmpty()) {
            int len = Q.size();
            System.out.print(L + " : ");
            for (int i = 0; i < len; i++) {
                Node1 cur = Q.poll(); // 맨앞에
                System.out.print(cur.data+ " ");
                if (cur.lt != null) Q.offer(cur.lt);
                if (cur.rt != null) Q.offer(cur.rt);
            }
            L++;
            System.out.println();
        }
    }

    public static void main(String[] args) {
        BinaryTreeLevelSearch tree = new BinaryTreeLevelSearch();
        tree.root = new Node1(1);
        tree.root.lt = new Node1(2);
        tree.root.rt = new Node1(3);
        tree.root.lt.lt = new Node1(4);
        tree.root.lt.rt = new Node1(5);
        tree.root.rt.lt = new Node1(6);
        tree.root.rt.rt = new Node1(7);
        tree.BFS(tree.root);
    }



}
