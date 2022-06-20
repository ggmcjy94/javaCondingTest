package test07;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 * BFS (송아지 찾기 문제)
 */
public class FindACalf {
    int[] dis = {1, -1 , 5};
    int[] ch;
    Queue<Integer> Q = new LinkedList<>();
    private int BFS(int s, int e) {
        ch = new int[10001];
        ch[s] = 1;
        Q.offer(s);
        int L = 0;
        while(!Q.isEmpty()) {
            int len = Q.size();
            for (int i = 0; i < len; i++) {
                int x = Q.poll();
                for (int j = 0; j < dis.length; j++) {
                    int nx = x + dis[j];
                    if (nx == e) return L+1; // 자식 노드니깐 +1
                    if (nx >= 1 && nx <= 10000 && ch[nx] == 0) {
                        ch[nx] = 1;
                        Q.offer(nx);
                    }
                }
            }
            L++;
        }
        return 0;
    }

    public static void main(String[] args) {
        FindACalf T = new FindACalf();
        Scanner kb = new Scanner(System.in);
        int s = kb.nextInt();
        int e = kb.nextInt();
        System.out.println(T.BFS(s,e));
    }


}
