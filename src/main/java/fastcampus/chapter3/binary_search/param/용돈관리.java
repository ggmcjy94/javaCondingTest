package fastcampus.chapter3.binary_search.param;

import java.util.Scanner;

public class 용돈관리 {

    static boolean determination(int m, int withdrawl, int[] arr) {
        int cnt = 1, sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (sum + arr[i] > withdrawl) {
                cnt++;
                sum = arr[i];
            } else {
                sum += arr[i];
            }
        }
        return cnt <= m;
    }

    static void pro(int n, int m, int[] arr) {
        int l = arr[0] , r = 100000, ans = 0;
        for (int i = 0; i < n; i++) l = Math.max(l , arr[i]);
        while (l <= r) {
            int mid = (l+r)/2;
            if (determination(m,mid , arr)) {
                ans = mid;
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        System.out.println(ans);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }
        pro(N, M, arr);
    }
}
