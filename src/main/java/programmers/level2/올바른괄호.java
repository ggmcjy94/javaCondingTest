package programmers.level2;

import java.util.Stack;

public class 올바른괄호 {

    boolean solution(String s) {
        boolean answer;
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == '(') {
                stack.push(c);
            } else {
                if (stack.isEmpty()) {
                    stack.push(c);
                    break;
                } else {
                    stack.pop();
                }
            }
        }
        if (stack.isEmpty()) {
            answer = true;
        } else {
            answer = false;
        }
        return answer;
    }
}
