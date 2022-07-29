package inflearn.study01.test8;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * dfs_bfs 강의 한번더
 */

//class Point {
//    int x, y;
//
//    public Point(int x, int y) {
//        this.x = x;
//        this.y = y;
//    }
//}
public class 피자집배달거리 {

    static int n,m,len, answer = Integer.MAX_VALUE;
    static int[] combi;
    static ArrayList<Point> pz , hs;


    public void DFS(int L, int s) {
        if (L == m) {
            int sum = 0;
            for (Point h : hs) {
                int dis = Integer.MAX_VALUE;
                for (int i : combi) { // 조합 인덱스
                    dis = Math.min(dis, Math.abs(h.x - pz.get(i).x) + Math.abs(h.y - pz.get(i).y));
                }
                sum += dis;
            }
            answer = Math.min(answer, sum);
        } else {
            for (int i = s; i < len; i++) {
                combi[L] = i; // 조합
                DFS(L+1, i+1);
            }
        }
    }

    public static void main(String[] args) {
        피자집배달거리 T = new 피자집배달거리();
        Scanner kb = new Scanner(System.in);
        n = kb.nextInt();
        m = kb.nextInt();
        pz = new ArrayList<>();
        hs = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            for(int j = 0; j <n; j++) {
                int tmp = kb.nextInt();
                if (tmp == 1) hs.add(new Point(i, j));
                else if (tmp == 2) pz.add(new Point(i, j));
            }
        }
        len = pz.size();
        combi = new int[m];
        T.DFS(0, 0);
        System.out.println(answer);
    }
}
