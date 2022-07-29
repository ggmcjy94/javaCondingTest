package inflearn.study01.test03;

import java.util.Scanner;

public class Exam34 {

    public int solution(int n, int k, int[] a) {
        int answer = 0, sum=0, lt=0;
        for (int rt = 0;  rt < n; rt++) {
            sum += a[rt];
            if (sum == k) answer++;
            while(sum >= k) {
                sum -= a[lt++];
                if (sum == k) answer++;
            }
        }
        return answer;
    }


    public static void main(String[] args) {
        Exam34 exam21 = new Exam34();
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
