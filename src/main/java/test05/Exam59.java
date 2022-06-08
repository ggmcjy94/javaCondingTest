package test05;


import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class Exam59 {

    public String solution(String need, String plan) {
        String answer = "YES";
        Queue<Character> Q = new LinkedList<>();
        for (char x : need.toCharArray()) Q.add(x);
        for (char x : plan.toCharArray()) {
            System.out.println(x);
            if (Q.contains(x)) {
                if (x != Q.poll()) return "NO";
            }
        }
        if (!Q.isEmpty()) return "NO";
        return answer;
    }

    public static void main(String[] args) {
        Exam59 exam51 = new Exam59();
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        System.out.println(exam51.solution2(a,b));
    }

    public String solution2(String need, String plan) {
        String answer = "YES";
        Queue<Character> Q = new LinkedList<>();
        for (char x : need.toCharArray()) Q.offer(x);
        for (char x : plan.toCharArray()) {
            if (Q.contains(x)) {
                if (x != Q.poll()) return "NO";
            }
        }
        if (!Q.isEmpty()) return "NO";
        return answer;
    }


    public String solution3(String need, String plan) {
        String answer = "YES";
        Queue<Character> Q = new LinkedList<>();
        for (char x : need.toCharArray()) Q.add(x);
        for (char x : plan.toCharArray()) {
            if (Q.contains(x)) {
                if (x != Q.poll()) return "NO";
            }
        }
        if (!Q.isEmpty()) return "NO";
        return answer;
    }

}
