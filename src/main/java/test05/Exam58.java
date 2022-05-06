package test05;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Exam58 {

    private int solution(String[] scores) {
        int answer = 0;
        int sum = 0;
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < scores.length; i++) {
            System.out.println("scores[i].length() = " + scores[i].length());
            for (int j = 0; j < scores[i].length(); j++) {
                switch (scores[i].charAt(j)) {
                    case 'A': sum += 5; break;
                    case 'B': sum += 4; break;
                    case 'C': sum += 3; break;
                    case 'D': sum += 2; break;
                    case 'E': sum += 1; break;
                    case 'F': sum += 0; break;
                }
            }

            int max = Integer.MAX_VALUE;
            arr.add(sum/scores[i].length());
            sum = 0;
        }

        for (Integer integer : arr) {
           if (integer >= 3) {
               answer++;
           }
        }
        return answer;
    }

    private static int Average(char charAt) {
        int sum = 0;
        switch (charAt) {
            case 'A': sum += 5; break;
            case 'B': sum += 4; break;
            case 'C': sum += 3; break;
            case 'D': sum += 2; break;
            case 'E': sum += 1; break;
            case 'F': sum += 0; break;
        }
        return sum;
    }

    public static void main(String[] args) {
        Exam58 exam51 = new Exam58();
        Scanner sc = new Scanner(System.in);
    }

}
