package test04;

import java.util.HashMap;
import java.util.Objects;
import java.util.Scanner;

public class Exam43 {

    public int[] solution(int n, int k, int[] arr) {
        int[] answer = new int[]{};
        return answer;
    }

    public static void main(String[] args) {
        Exam43 exam21 = new Exam43();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i : exam21.solution(n, k , arr)) {
            System.out.print(i + " ");
        }
    }
}
