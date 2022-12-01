package solved.bronze3;
import java.util.Arrays;
import java.util.Scanner;

public class 직각삼각형 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            int[] arr = new int[3];
            for (int i = 0; i< arr.length; i++) {
                arr[i] = sc.nextInt();
            }
            Arrays.sort(arr);
            int l = arr[0];
            int r = arr[1];
            int b = arr[2];
            if (l==0&&r==0&&b==0) break;
            if (Math.pow(l, 2) + Math.pow(r, 2) == Math.pow(b, 2)) {
                System.out.println("right");
            } else {
                System.out.println("wrong");
            }
        }
    }
}
