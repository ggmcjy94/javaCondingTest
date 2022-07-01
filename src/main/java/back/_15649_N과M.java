package back;

import java.util.Scanner;

public class _15649_N과M {
    static int n ,m;
    static int[] arr;
    static boolean[] isUsed;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        m = sc.nextInt();

        isUsed = new boolean[n + 1];
        arr = new int[m + 1];

        recursion(0);

    }

    private static void recursion(int idx) {
        if (idx == m) {
            for (int i = 0; i < m; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
            return;
        } else{
            for (int i = 1; i <= n; i++) {
                if (!isUsed[i]) {
                    isUsed[i] = true;
                    arr[idx] = i;
                    recursion(idx + 1);
                    isUsed[i] = false;
                }
            }
        }

    }

}
