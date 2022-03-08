package test01;

import java.util.ArrayList;
import java.util.Scanner;


public class Exam04 {
    public ArrayList<String> solution(String[] str) {
        ArrayList<String> answer = new ArrayList<>();
        for (String s : str) {
            String tmp = new StringBuilder(s).reverse().toString();
            answer.add(tmp);
        }
        return answer;
    }
    public static void main(String[] args) {
        Exam04 ex = new Exam04();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        String[] str = new String[n];
        for (int i = 0; i < n; i++) {
            str[i] = sc.next();
        }
        for (String s : ex.solution(str)) {
            System.out.println(s);
        }

    }
}

