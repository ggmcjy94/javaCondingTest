package solved.silver5;

import java.util.Arrays;
import java.util.Scanner;

public class 국회의원선거 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        if (N == 1) {
            System.out.println(0);
            return;
        }

        int[] arr = new int[N-1];
        int a = sc.nextInt();
        for (int i = 0; i < N-1; i++) {
            arr[i] = sc.nextInt();
        }


        int cnt = 0;
        while (true) {
            Arrays.sort(arr);  // 제일 큰 숫자를 계속 뒤로 보내는게 핵심
            if (arr[N-2] < a) break;
            cnt++;
            arr[N-2]--;
            a++;
        }
        System.out.println(cnt);
    }
}
