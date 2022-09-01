package fastcampus.chapter3.binary_search.param;

import java.util.Scanner;

public class 기타레슨 {

   static boolean determination(int mid, int[] arr, int m) {
        int cnt = 1, sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (sum + arr[i] > mid) {
                cnt ++;
                sum = arr[i];
            } else {
                sum += arr[i];
            }
        }
        return cnt <= m;
    }

    static void pro(int[] arr, int m) {
        int l = arr[0], r = 1000000000 , ans =0;
        for (int i = 0; i < arr.length; i++) l = Math.max(l, arr[i]); // 적어도 제일 긴 녹화본의 길이 만큼은 필요하다!
        while (l <= r) {
            int mid = (l+r)/2;
            if (determination(mid, arr, m)) {
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
        pro(arr, M);
    }
}
