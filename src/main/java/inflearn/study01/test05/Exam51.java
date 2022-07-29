package inflearn.study01.test05;

import java.util.Scanner;
import java.util.Stack;

public class Exam51 {

    private String solution(String s) {
        String answer = "YES";
        Stack<Character> st = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c=='(') st.push(c);
            else {
                if (st.isEmpty()) return "NO";
                st.pop();
            }
        }
        if (!st.isEmpty()) {
            return "NO";
        }
        return answer;
    }


    public static void main(String[] args) {
        Exam51 exam51 = new Exam51();
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println(exam51.solution(s));
    }


}
