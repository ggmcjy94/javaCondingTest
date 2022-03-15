package test03;

import java.util.Scanner;

public class Exam36 {

    public int solution(int n, int k, int[] arr) {
        int answer = 0,sum=0,lt=0;
        return answer;
    }

    public static void main(String[] args) {
        Exam36 exam21 = new Exam36();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(exam21.solution(n,k,arr));
    }
}
