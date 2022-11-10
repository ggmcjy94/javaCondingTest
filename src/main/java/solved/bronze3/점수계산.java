package solved.bronze3;

import java.util.Scanner;

public class 점수계산 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int sum = 0;
        int num = 0;
        for (int i : arr) {
            if (i == 0) {
                num = 0;
            } else {
                num += 1;
            }
            sum += num;
        }
        System.out.println(sum);
    }
}
