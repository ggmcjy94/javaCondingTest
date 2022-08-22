package back.greedy;

import java.util.Scanner;

public class 동전0 {

    static int solution(int k, int[] coins) {
        int answer = 0;
        for (int i = coins.length-1; i >= 0; i--) {
            while (k >= coins[i]) {
                k -= coins[i];
                answer++;
            }
        }
        return answer;
    }



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int[] coins = new int[N];
        for (int i = 0; i < N; i++) {
            coins[i] = sc.nextInt();
        }
        System.out.println(solution(K,coins));
    }
}
