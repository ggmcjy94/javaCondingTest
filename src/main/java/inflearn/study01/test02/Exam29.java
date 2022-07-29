package inflearn.study01.test02;

import java.util.Scanner;

public class Exam29 {

    public int solution(int n, int[][] arr) {
        int answer = Integer.MIN_VALUE;
        int sum1, sum2;
        for (int i = 0; i < n; i++) {
            sum1 = sum2 = 0;
            for (int j = 0; j < n; j++) {
                sum1+=arr[i][j]; //행 0 열 0~4
                sum2+=arr[j][i]; //열 0 행 0~4
            }
            answer=Math.max(answer, sum1);
            answer=Math.max(answer, sum2);
        }
        //대각선
        sum1 = sum2 = 0;
        for (int i = 0; i < n; i++) {
            sum1+=arr[i][i];
            sum2+=arr[i][n-i-1];
        }
        answer = Math.max(answer,sum1);
        answer = Math.max(answer,sum2);
        return answer;
    }


    public int solution2(int n, int[][] arr) {
        int answer = Integer.MIN_VALUE;
        int sum1 , sum2;
        for (int i = 0; i < n; i++) {
            sum1 = sum2 = 0;
            for (int j = 0; j < n; j++) {
                sum1 += arr[i][j];
                sum2 += arr[j][i];
            }
            answer = Math.max(answer, sum1);
            answer = Math.max(answer, sum2);
        }

        sum1 = sum2 = 0;
        for (int i = 0; i < n; i++) {
            sum1 += arr[i][i];
            sum2 += arr[i][n-i-1];
        }
        return answer;
    }

    public static void main(String[] args) {
        Exam29 exam21 = new Exam29();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println(exam21.solution(n , arr));
    }
}
