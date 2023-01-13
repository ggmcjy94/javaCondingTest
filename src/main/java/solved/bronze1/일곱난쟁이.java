package solved.bronze1;

import java.util.Arrays;
import java.util.Scanner;

public class 일곱난쟁이 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 9;
        int[] arr = new int[n];
        int sum = 0;
        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            arr[i] = a;
            sum += a;
        }
        // 다 더해주 고 브루트포스 알고리즘으로 순차 하면서 빼주면 값이 나옴 
        for (int i = 0; i < n-1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (sum - arr[i] - arr[j] == 100) {
                    arr[i] = 0;
                    arr[j] = 0;
                    Arrays.sort(arr);
                    for (int k = 2; k < 9; k++) {
                        System.out.println(arr[k]);
                    }
                    return;
                }
            }
        }
    }
}
