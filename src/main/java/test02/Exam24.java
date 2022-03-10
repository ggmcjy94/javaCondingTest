package test02;

import java.util.ArrayList;
import java.util.Scanner;

public class Exam24 {

    public int[] solution(int n) {
        int[] answer = new int[n];
        answer[0] = 1;
        answer[1] = 1;
        for (int i = 2; i < n; i++) {
            answer[i] = answer[i-2]+answer[i-1];
            System.out.println("1");
        }
        return answer;
    }
    public int[] solution2(int n) {
        int[] answer = new int[n];
        answer[0] = 1;
        answer[1] = 1;
        for (int i = 2; i < n; i++) {
            answer[i] = answer[i-2] + answer[i - 1];
        }
        return answer;
    }

    public void solution3(int n) {
        int a = 1 , b = 1, c;
        System.out.print(a+" " + b+ " ");
        for (int i = 2; i < n; i++) {
            c = a+b;
            System.out.print(c + " ");
            a = b;
            b = c;
        }
    }
    public static void main(String[] args) {
        Exam24 exam21 = new Exam24();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i : exam21.solution(n)) {
            System.out.print(i + " ");
        }
    }
}
