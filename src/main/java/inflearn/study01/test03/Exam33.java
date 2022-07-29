package inflearn.study01.test03;

import java.util.Scanner;

public class Exam33 {

    public int solution(int n, int k, int[] a) {
        int answer , sum = 0;
        for (int i = 0; i <k; i++) sum += a[i]; // 0,1,2 합계를 구하고
        answer = sum;
        for (int i = k; i < n; i++) { //3 < n 까지
            sum += (a[i] - a[i-k]);
            answer = Math.max(answer, sum);
        }
        return answer;
    }


    public static void main(String[] args) {
        Exam33 exam21 = new Exam33();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println(exam21.solution(n, k , a));
    }
}
