package inflearn.study01.test10;

import java.util.Scanner;

/**
 * dfs_bfs 로 풀수 있으나 이것도 n 제한이 커지면 다이나믹으로 풀어야 된다,
 * 냅색 알고리즘
 */
public class 최대점수구하기 {

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int m = kb.nextInt();
        int[] dy = new int[m+1];
        for (int i = 0; i < n; i++) {
            int ps = kb.nextInt();
            int pt = kb.nextInt();
            for (int j = m; j >= pt; j--) {
                dy[j] = Math.max(dy[j], dy[j - pt] + ps);
            }
        }
        System.out.println(dy[m]);
    }
}
