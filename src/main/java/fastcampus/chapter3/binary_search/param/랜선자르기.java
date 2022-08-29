package fastcampus.chapter3.binary_search.param;

import java.util.Scanner;

public class 랜선자르기 {

    static boolean determination(int[] arr, int n, long len) {
        long sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i] / len;
        }
        return sum >= n; //sum >= 11;
    }

    static void pro(int[] arr, int n) { // 802 743 457 539
        long l = 0, r = Integer.MAX_VALUE, ans = 0;
        while (l <= r) {
            long mid = (l+r) / 2;
            if (determination(arr, n, mid)) {
                ans = mid;
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
        System.out.println(ans);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int K = sc.nextInt();
        int N = sc.nextInt();
        int[] arr = new int[K];
        for (int i = 0; i < K; i++) {
            arr[i] = sc.nextInt();
        }
        pro(arr, N);
    }
}
