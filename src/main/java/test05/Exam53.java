package test05;

import java.util.Scanner;
import java.util.Stack;

public class Exam53 {

    private String solution(String s) {
        String answer = "";
        Stack<Character> stack = new Stack<>();
        for (char x : s.toCharArray()) {
            if (x == ')') {
                // stack 제일 상단을 꺼냄 (ab))) => b a ( 출력
                while (stack.pop() != '(');
            }
            else stack.push(x);
        }
        for (int i = 0; i < stack.size(); i++) answer += stack.get(i);
        return answer;
    }

    private String solution2(String s) {
        String answer = "";
        Stack<Character> stack =  new Stack<>();
        for (char x : s.toCharArray()) {
            if (x == ')') {
                while (stack.pop() != '(');
            }
            else stack.push(x);
        }
        for (Character c : stack) {
            answer += c;
        }
        return answer;
    }



    public static void main(String[] args) {
        Exam53 exam51 = new Exam53();
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println(exam51.solution2(s));
    }


}
