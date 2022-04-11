package test05;

import java.util.Scanner;
import java.util.Stack;

public class Exam55 {

    private int solution(String p) {
        int answer = 0;
        Stack<Integer> stack = new Stack<>();
        for (char x : p.toCharArray()) {
            // 아스키 문자 48 = 0, 49 = 1, 50 = 2, 51 = 3, 52 = 4, 53 = 5
            if (Character.isDigit(x)) stack.push(x-48);// 정수냐
            else {
                int rt = stack.pop();
                int lt = stack.pop();
                if (x == '+') stack.push(lt+rt);
                else if (x == '-') stack.push(lt - rt);
                else if (x == '*') stack.push(lt * rt);
                else if (x == '/') stack.push(lt / rt);
            }
        }
        answer = stack.get(0);
        return answer;
    }

    public static void main(String[] args) {
        Exam55 exam51 = new Exam55();
        Scanner sc = new Scanner(System.in);
        String p = sc.next();
        System.out.println(exam51.solution2(p));
    }

    private int solution2(String p) {
        int answer = 0;
        Stack<Integer> stack = new Stack<>();
        for (char x : p.toCharArray()) {
            if (Character.isDigit(x)) stack.push(x - 48);
            else {
                int rt = stack.pop();
                int lt = stack.pop();
                if (x =='+') stack.push(lt + rt);
                if (x =='-') stack.push(lt - rt);
                if (x =='*') stack.push(lt * rt);
                if (x =='/') stack.push(lt / rt);
            }
        }
        answer = stack.get(0);
        return answer;
    }

}
