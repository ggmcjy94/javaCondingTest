package test02;

import java.util.Scanner;

public class Exam211 {

    public int solution(int n, int[][] arr) {
        int answer = 0, min = Integer.MIN_VALUE;
        for (int i = 1; i <= n; i++) { //i 반
            int cnt = 0;
            for (int j = 1; j <= n; j++) { // j 반
                for (int k = 1; k <= 5; k++) { //학년
                    if (arr[i][k] == arr[j][k]) {
                        cnt++;
                        break; //한번만 카운팅을 하기위해 같은 반이었던 학생 수 이기 때문에
                    }
                }
            }
            if (cnt > min) {
                min = cnt;
                answer = i;
            }
        }

        return answer;
    }

    public int solution2(int n, int[][] arr) {
        int answer = 0, min = Integer.MIN_VALUE;
        for (int i = 1; i <= n; i++) {
            int cnt = 0;
            for (int j = 1; j <= n; j++) {
                for (int k = 1; k <= 5; k++) {
                    if (arr[i][k] == arr[j][k]) {
                        cnt++;
                        break;
                    }
                }
            }
            if (cnt > min) {
                min = cnt;
                answer = i;
            }
        }
        return answer;
    }
    public static void main(String[] args) {
        Exam211 exam21 = new Exam211();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n+1][6];
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= 5; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println(exam21.solution(n , arr));
    }
}
