package fastcampus.chapter3.two_pointers;

import java.util.Scanner;

/**
 * 수들의합2 2003
 * 수열 2559
 * 귀여운 라이언 15565
 * 배열 합치기 11728
 * 수 고르기 2230
 */

public class 부분합 {

    static int n, S;
    static int[] a;
    static void pro() {
        int R = 0, sum = 0 , ans = n + 1;
        for (int L = 1; L <= n; L++) {
            sum -= a[L - 1];
            while (R + 1 <= n && sum < S) {
                sum += a[++R];

            }
            if (sum >= S) {
                ans = Math.min(ans, R - L + 1);
            }
        }

        if (ans == n + 1) {
            ans = 0;
        }
        System.out.println(ans);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        S = sc.nextInt();
        a = new int[n+1];
        for (int i = 1; i <= n; i++) {
            a[i] = sc.nextInt();
        }
        pro();
    }
}
