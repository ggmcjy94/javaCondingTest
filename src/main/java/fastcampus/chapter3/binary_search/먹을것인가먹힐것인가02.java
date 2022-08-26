package fastcampus.chapter3.binary_search;

import java.util.Arrays;
import java.util.Scanner;

public class 먹을것인가먹힐것인가02 {
    static int N, M;
    static int[] A , B;
    static Scanner sc;

    static int lower_bound(int[] B, int L, int R, int X) {
        // A[L...R] 에서 X 미만의 수(X 보다 작은 수) 중 제일 오른쪽 인덱스를 return 하는 함수
        // 그런 게 없다면 L - 1 을 return 한다
        // 8 1 7 3 1
        // 1 3 6
        int result = L - 1;
        while(L <= R) { // 3 <= 3
            int mid = (L + R) /2;
            if (B[mid] < X) { // 3 < 8
                result = mid; // r = 2
                L = mid + 1; // L = 3
            } else {
                R = mid - 1;
            }
        }
        return result;
    }

    static int pro() {
        Arrays.sort(B, 1 , M + 1);
        int ans = 0;

        for (int i = 1; i <= N; i++) {
            ans += lower_bound(B,1,M,A[i]);
        }
        return ans;
    }

    static void input(Scanner sc) {

        N = sc.nextInt();
        M = sc.nextInt();
        A = new int[N+1];
        B = new int[M+1];
        for (int i=1; i <= N; i++) {
            A[i] = sc.nextInt();
        }
        for (int i=1; i <= M; i++) {
            B[i] = sc.nextInt();
        }
    }

    public static void main(String[] args) {
        sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i=0; i < T; i++) {
            input(sc);
            System.out.println(pro());
        }
    }
}
