package fastcampus.chapter3.binary_search;

import java.util.Arrays;
import java.util.Scanner;

public class 먹을것인가먹힐것인가 {



    static int solution(int[] a, int[] b) {
        Arrays.sort(b);
        // 8 1 7 3 1
        // 1 3 6
        int cnt = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b.length; j++) {
                if (a[i] > b[j]) {
                    cnt++;
                } else {
                    break;
                }
            }
        }
        return cnt;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int[] a = new int[A];
        int[] b = new int[B];
        for (int i=0; i < A; i++) {
            a[i] = sc.nextInt();
        }
        for (int i=0; i < B; i++) {
            b[i] = sc.nextInt();
        }

        System.out.println(solution(a, b));
    }
}
