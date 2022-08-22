package back.backtracking;

import java.util.Scanner;

public class N과M문제01 {

    static int N, M;
    static int[] nums;

    static void rec_func(int k) {
        if (k == M + 1) {
            for (int i = 1; i <= M; i++) {
                System.out.print(nums[i]);
                System.out.print(' ');
            }
            System.out.println();
        } else {
            for (int c = 1; c <= N; c++) {
                boolean isUsed = false;
                for (int i = 1; i <= k; i++) {
                    if (c == nums[i]) isUsed = true;
                }
                if (!isUsed) {
                    nums[k] = c;
                    rec_func(k+1);
                    nums[k] = 0;
                }
            }

        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();
        nums = new int[M+1];
        rec_func(1);
    }
}
