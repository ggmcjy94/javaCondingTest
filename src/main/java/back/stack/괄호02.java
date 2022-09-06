package back.stack;

import java.util.Scanner;
import java.util.Stack;

public class 괄호02 {

    static void myPro(String A) {
        Stack<Character> stack = new Stack<>();
        for (char c : A.toCharArray()) {
            if (c == '(') stack.push(c);
            else if (c == ')' && !stack.isEmpty()) {
                stack.pop();
            } else {
                stack.push(c);
                break;
            }
        }
        if (stack.isEmpty()) System.out.println("YES");
        else System.out.println("NO");
    }

    static void pro(String A) {
        Stack<Character> stack = new Stack<>();
        for (char c : A.toCharArray()) {
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
        if (stack.isEmpty()) System.out.println("YES");
        else System.out.println("NO");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T; i++) {
            String A = sc.next();
            pro(A);
        }
    }
}
