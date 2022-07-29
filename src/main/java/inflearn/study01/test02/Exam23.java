package inflearn.study01.test02;

import java.util.ArrayList;
import java.util.Scanner;

public class Exam23 {

    public ArrayList<String> solution(int n, int[] a, int[] b) {
        ArrayList<String> answer = new ArrayList<>();
        int[] rule = {1 , 2, 3};
        for (int i = 0; i < n; i++) {
            if (a[i] == b[i]) {
                answer.add("D");
            } else if (a[i] == rule[0] && b[i] == rule[2]){
                answer.add("A");
            } else if (a[i] == rule[1] && b[i] == rule[0]) {
                answer.add("A");
            } else if (a[i] == rule[2] && b[i] == rule[1]) {
                answer.add("A");
            } else {
                answer.add("B");
            }
        }
        return answer;
    }

    public String solution2(int n, int[] a, int[] b) {
        String answer = "";
        for (int i = 0; i < n; i++) {
            if (a[i] == b[i]) answer+="D";
            else if (a[i] == 1 && b[i]==3) answer+="A";
            else if (a[i] == 2 && b[i]==1) answer+="A";
            else if (a[i] == 3 && b[i]==2) answer+="A";
            else answer+="B";
        }
        return answer;
    }

    public static void main(String[] args) {
        Exam23 exam21 = new Exam23();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            b[i] = sc.nextInt();
        }
        for (String integer : exam21.solution(n, a, b)) {
            System.out.println(integer);
        }
    }
}
