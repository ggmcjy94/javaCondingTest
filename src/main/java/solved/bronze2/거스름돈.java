package solved.bronze2;

import java.util.List;
import java.util.Scanner;

public class 거스름돈 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int g = sc.nextInt();
        int k = 1000 - g;
        int cnt = 0;
        int[] arr = new int[]{500, 100, 50, 10,5 ,1};

        for (int i : arr) {
            while (k > 0) {
                if (k >= i) {
                    k = k - i;
                    cnt++;
                } else {
                    break;
                }
            }
        }
        System.out.println(cnt);
    }
}
