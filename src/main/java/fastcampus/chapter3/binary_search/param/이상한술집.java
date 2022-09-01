package fastcampus.chapter3.binary_search.param;

import java.util.Scanner;

public class 이상한술집 {

    static boolean determination(int k , long mid, int[] arr) {
        if (mid == 0) return false;
        long sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i] / mid;
        }
        return sum >= k;
    }

    static void pro(int k , int[] arr) {
        long l = 0 , r = Integer.MAX_VALUE, ans = 0;
        while (l <= r) {
            long mid = (l + r) / 2;
            if (determination(k, mid, arr)) {
                ans = mid;
                l = mid + 1;
            } else {
                r = mid -1 ;
            }
        }
        System.out.println(ans);
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int[] arr = new int[N];
        for (int i=0; i<N; i++) {
            arr[i] = sc.nextInt();
        }
        pro(K, arr);
    }
}
