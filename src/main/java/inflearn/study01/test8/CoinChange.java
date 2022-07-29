package inflearn.study01.test8;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

/**
 * 동전교환 (
 */
public class CoinChange {
    static int answer = Integer.MAX_VALUE, n , m;

    private void DFS(int L, int sum, Integer[] arr) {

        if (sum > m) return;
        if (L >= answer) return;
        if (sum == m) {
            answer = Math.min(answer, L);
        } else {
            for (int i = 0; i < n; i++) {
                DFS(L+1, sum + arr[i], arr);
            }
        }
    }

    public static void main(String[] args) {
        CoinChange T = new CoinChange();
        Scanner kb = new Scanner(System.in);
        n = kb.nextInt();
        Integer[] arr = new Integer[n];
        for (int i = 0; i < n; i++) {
            arr[i] = kb.nextInt();
        }
        Arrays.sort(arr, Collections.reverseOrder()); //내림차순
        m = kb.nextInt();
        T.DFS(0,0, arr);
        System.out.println(answer);
    }


}
