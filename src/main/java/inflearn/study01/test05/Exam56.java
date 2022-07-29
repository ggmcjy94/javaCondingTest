package inflearn.study01.test05;

import java.util.Scanner;
import java.util.Stack;

public class Exam56 {

    private int solution(String p) {
        int answer = 0;
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < p.length(); i++) {
            if (p.charAt(i) == '(') stack.push('(');
            else {
                stack.pop();
                if (p.charAt(i - 1) == '(') answer+=stack.size();
                else answer++;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Exam56 exam51 = new Exam56();
        Scanner sc = new Scanner(System.in);
        String p = sc.next();
        System.out.println(exam51.solution(p));
    }

}

// 면접 보는 거 같은 분위긴대 ㅋㅋㅋㅋㅋㅋ