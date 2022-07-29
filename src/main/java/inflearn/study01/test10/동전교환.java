package inflearn.study01.test10;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 다이나믹 냅색 알고리즘
 * n개수가 12개는 dfs로 되는대 50개는 타임리미트 남
 */
public class 동전교환 {
    static int n, m;
    static int[] dy; //동전의 개수
    public int solution(int[] coin) {
        Arrays.fill(dy, Integer.MAX_VALUE);
        dy[0] = 0;
        for (int i = 0; i < n; i++) {
            for (int j = coin[i]; j<=m; j++) { //코인의 값부터 돌아야된다 작으면 필요가 없으니깐
                dy[j] = Math.min(dy[j], dy[j-coin[i]] + 1);
            }
        }
        return dy[m];
    }

    public static void main(String[] args) {
        동전교환 T = new 동전교환();
        Scanner kb = new Scanner(System.in);
        n = kb.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = kb.nextInt();
        }
        m = kb.nextInt();
        dy = new int[m+1]; // 0 ~ 15 까지 돌아
        System.out.println(T.solution(arr));

    }

}
