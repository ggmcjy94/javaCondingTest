package solved.silver5;

import java.util.Scanner;

public class 방번호 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 9999
        String N = sc.next();
        int[] arr = new int[10];
        for (int i=0; i < N.length(); i++) {
            int num = Character.getNumericValue(N.charAt(i));
            if (num == 6) {
                arr[9] ++;
            } else {
                arr[num]++;
            }
        }
        int max = 0;
        for (int i = 0; i < 9; i++) {
            max = Math.max(max, arr[i]);
        }
        int nine = arr[9]/2;
        if (arr[9]%2 == 1) nine++;
        max = Math.max(max,nine);
        System.out.println(max);
    }
}
