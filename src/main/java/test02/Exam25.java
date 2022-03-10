package test02;

import java.util.Scanner;

public class Exam25 {


    public int solution2(int n) {
        int answer = 0;
        int[] ch = new int[n+1]; //21칸
        for (int i = 2; i <= n; i++) { //2 ~ 21 까지니깐 칸이 20;
            if (ch[i] == 0) {
                answer++;
                for (int j = i; j <= n; j=j+i) {

                    ch[j] = 1;
                }
            }
        }
        return answer;
    }
    public int solution(int n) {
        int answer = 0;
        int[] ch = new int[n + 1];
        for (int i=2; i <=n; i++) {
            if (ch[i] == 0) { // 2 ,3, 4
                answer++;
                for (int j=i; j<=n; j= j+i) { // 2의 배수들 1로 , 3 의 배수들 1로 , 4의 배수들 1 로
                    ch[j] = 1;
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Exam25 exam21 = new Exam25();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(exam21.solution(n));
    }
}
