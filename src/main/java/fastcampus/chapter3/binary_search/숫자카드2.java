package fastcampus.chapter3.binary_search;

import java.util.Arrays;
import java.util.Scanner;


public class 숫자카드2 {

    private static int lowerBound(int[] a, int target) { // 3
        int l = 0;
        int r = a.length -1;
        while (l <= r) {
            int mid = (l+r) / 2; // 1 2 3 4 4 5 6 6 6
            if (target <= a[mid]) { // 4
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return l;
    }

    private static int upperBound(int[] a, int target) { // 5
        int l = 0;
        int r = a.length -1;
        while (l <= r) {
            int mid = (l+r) / 2; // 1 2 3 4 4 5 6 6 6
            if (target < a[mid]) { // 4
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return l;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int N = sc.nextInt();
        int[] A = new int[N];
        for (int i=0; i<N; i++) {
            A[i] = sc.nextInt();
        }
        Arrays.sort(A);
        int M = sc.nextInt();
        StringBuilder sb = new StringBuilder();

        for (int i=0; i<M; i++) {
            int target = sc.nextInt();
            sb.append(upperBound(A,target) - lowerBound(A,target)).append(' ');
        }
        System.out.println(sb);
    }
}
