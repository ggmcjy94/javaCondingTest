package inflearn.study01.test05;

import java.util.Scanner;
import java.util.Stack;

public class Exam52 {

    private String solution(String s) {
        String answer = "";
        Stack<Character> st = new Stack<>();
        for (char x : s.toCharArray()) {
            if (x==')'){
                while (st.pop() != '(');
            }
            else st.push(x);
        }
        for (int i = 0; i < st.size(); i++) answer += st.get(i);
        return answer;
    }


    public static void main(String[] args) {
        Exam52 exam51 = new Exam52();
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println(exam51.solution(s));
    }


}
