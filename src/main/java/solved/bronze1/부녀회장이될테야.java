package solved.bronze1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class 부녀회장이될테야 {

    static int T, k , n;

    static int pro (int k, int n) {
        int[][] arr = new int[T+1][n+1];

        for (int i = 1; i <= n; i++) {
            arr[0][i] = i;
        }

        for (int i = 1; i <= T; i++) {
            int sum = 0;
            for (int j = 1; j <= n; j++) {
                int num = arr[i-1][j];
                sum += num;
                arr[i][j] = sum; // 1 1 == 0 1 // 1 2 == 0 1 + 0 2 // 1 3 == 0 1 ,0 2 ,0 3
            }
        }
        return arr[k][n];
    }

    public static void main(String[] args) {
        // 0
        // 1 1
        // 2 2
        // 3 3
        //1
        // 1 1
        // 2 3
        // 3 6
        //2
        // 1 1
        // 2 4
        // 3 10
        Scanner sc = new Scanner(System.in);
        T = sc.nextInt();
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < T; i++) {
            k = sc.nextInt();
            n = sc.nextInt();
            list.add(pro(k,n));
        }
        for (Integer integer : list) {
            System.out.println(integer);
        }
    }
}
