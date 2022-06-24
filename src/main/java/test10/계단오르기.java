package test10;
import java.util.Scanner;

/**
 * dynamic programming(동적계획법)
 */
public class 계단오르기 {


    static int[] dy;

    private int solution(int n) {
        dy[1] = 1;
        dy[2] = 2;
        for (int i = 3; i <= n; i++) {
            dy[i] = dy[i-2] + dy[i-1]; // 피보나치 수열 과 비슷
        }
        return dy[n];
    }

    public static void main(String[] args) {
        계단오르기 T = new 계단오르기();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        dy = new int[n+1];
        System.out.println(T.solution(n));
    }


}
