package inflearn.study01.test05;

import java.util.Scanner;
import java.util.Stack;

public class Exam54 {

    private int solution(int[][] board, int[] moves) {
        int answer = 0;
        Stack<Integer> stack = new Stack<>();
        for (int pos : moves) {
            for (int i = 0; i < board.length; i++) { //board.length 행 크기 board.length[0].length; 열 크기
                System.out.print(i);
                if (board[i][pos-1] != 0) { //인형 발견
                    int tmp = board[i][pos - 1];
                    board[i][pos-1] = 0;
                    if (!stack.isEmpty() && tmp == stack.peek()) { //peek 스택에 상단
                        answer += 2;
                        stack.pop();
                    }
                    else stack.push(tmp);
                    break; // for 문 종료
                }
            }
        }
        return answer;
    }


    //4 3 1

    public static void main(String[] args) {
        Exam54 exam51 = new Exam54();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int board[][] = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = sc.nextInt();
            }
        }
        int m  = sc.nextInt();
        int [] moves = new int[m];
        for (int i = 0; i <m; i++) moves[i] = sc.nextInt();
        System.out.println(exam51.solution2(board, moves));
    }

    private int solution2(int[][] board, int[] moves) {
        int answer = 0;
        Stack<Integer> stack = new Stack<>();
        for (int pos : moves) {
            for (int i = 0; i < board.length; i++) {
                if (board[i][pos-1] != 0) {
                    int tmp = board[i][pos-1];
                    board[i][pos-1] = 0;
                    if (!stack.isEmpty() && tmp==stack.peek()) {
                        answer+= 2;
                        stack.pop();
                    }
                    else stack.push(tmp);
                    break; //리셋
                }
            }
        }
        return answer;
    }


}
