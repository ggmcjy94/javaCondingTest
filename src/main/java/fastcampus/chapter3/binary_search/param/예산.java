package fastcampus.chapter3.binary_search.param;

import java.util.Scanner;

public class 예산 {

    static boolean determination(int mid, int[] arr, int k) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += Math.min(arr[i], mid);
        }
        return sum <= k;
    }

    static void pro (int[] arr, int k) {
        int l = 0, r = 0, ans = 0;
        for (int i = 0; i < arr.length; i++) r = Math.max(r, arr[i]);
        while (l <= r) {
            int mid = (l + r) / 2;
            if (determination(mid, arr , k)) { // 120 110 140 150
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
        int N = sc.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }
        int K = sc.nextInt();
        pro(arr, K);
    }
}
