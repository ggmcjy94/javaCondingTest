package test02;

import java.util.ArrayList;
import java.util.Scanner;

public class Exam22 {

    public int solution(int n, int[] arr) {
        int answer = 1;
        int first = arr[0];
        for (int i = 1; i < n; i++) {
            if (first < arr[i]) {
                first = arr[i];
                answer++;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Exam22 exam21 = new Exam22();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(exam21.solution(n,arr));
    }
}
