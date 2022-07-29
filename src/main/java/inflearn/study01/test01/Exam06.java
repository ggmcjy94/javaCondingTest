package inflearn.study01.test01;

import java.util.Scanner;

//            System.out.println(str.charAt(i)+ " " + i + " "+ " " + str.indexOf(str.charAt(i)));

public class Exam06 {
    public String solution(String str) {
        String answer = "";
        for (int i = 0; i < str.length(); i++) {
            if (str.indexOf(str.charAt(i)) == i) {
                answer += str.charAt(i);
            }
        }
        return answer;
    }
    public static void main(String[] args) {
        Exam06 exam06 = new Exam06();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String solution = exam06.solution(str);
        System.out.println(solution);
    }
}

