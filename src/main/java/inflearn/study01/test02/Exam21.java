package inflearn.study01.test02;

import java.util.ArrayList;
import java.util.Scanner;

public class Exam21 {

    public ArrayList<Integer> solution(int n, int[] arr) {
        ArrayList<Integer> answer = new ArrayList<Integer>();
        answer.add(arr[0]);
        for (int i = 1; i < n; i++) {
            if (arr[i] > arr[i - 1]) {
                answer.add(arr[i]);
            }
        }
        return answer;
    }

    public ArrayList<Integer> solution2(int n, int[] arr) {
        ArrayList<Integer> answer = new ArrayList<Integer>();
        answer.add(arr[0]);
        for (int i = 1; i < n; i++) {
            if (arr[i] > arr[i - 1]) {
                answer.add(arr[i]);
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Exam21 exam21 = new Exam21();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for (Integer x : exam21.solution2(n, arr)) {
            System.out.print(x + " ");
        }
    }
}
