package programmers.level1;

import java.util.Stack;

public class 다트게임 {

    public int solution(String dartResult) {
        int answer = 0;
        Stack<Character> stack = new Stack<>();
        for (char c : dartResult.toCharArray()) {
            if (!Character.isAlphabetic(c)) {
                stack.push(c);
            }
            switch (c) {
                case 'S':
                    answer += (int) Math.pow(Integer.parseInt(String.valueOf(stack.pop())), 1);
                    break;
                case 'D':
                    answer += (int) Math.pow(Integer.parseInt(String.valueOf(stack.pop())), 2);
                    break;
                case 'T':
                    answer += (int) Math.pow(Integer.parseInt(String.valueOf(stack.pop())), 3);
                    break;
                case '*':
                    answer *= 2;
                    break;
                case '#':
                    answer *= -1;
                    break;
            }
        }
        return answer;
    }
}


