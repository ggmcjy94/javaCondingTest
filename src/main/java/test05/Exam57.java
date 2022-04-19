package test05;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class Exam57 {

    private int solution(int n, int k) {
        int answer = 0;
        Queue<Integer> Q = new LinkedList<>();
        for (int i = 1; i <= n; i++) Q.offer(i); // q 에 담는다
        while(!Q.isEmpty()) { // q 가 비어질때 까지
            for (int i = 1; i < k; i++) Q.offer(Q.poll());
            Q.poll();
            if (Q.size() ==1) answer = Q.poll(); //poll 은 q 에서 삭제
        }
        return answer;
    }

    public static void main(String[] args) {
        Exam57 exam51 = new Exam57();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        System.out.println(exam51.solution(n, k));
    }

}
