package test01;

import java.util.Scanner;

//회문 문자열
public class Exam12 {
    public String solution(int t, String s) {
        String answer = "";
        for (int i = 0; i < t; i++) {
            String tmp = s.substring(0, 7)
                    .replace('#', '1')
                    .replace('*', '0');
            int num = Integer.parseInt(tmp, 2); // 2진수
            answer += (char)num;
            s = s.substring(7); // 7 부터 끊기
        }
        return answer;
    }

    public String solution2(int t, String s) {
        String answer = "";
        for (int i = 0; i < t; i++) {
            String tmp = s.substring(0, 7)
                    .replace('#', '1')
                    .replace('*', '0');
            int num = Integer.parseInt(tmp, 2);
            answer += (char)num;
            s = s.substring(7);
        }
        return answer;
    }

    public static void main(String[] args) {
        Exam12 exam07 = new Exam12();
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        String str = sc.next();
        System.out.println(exam07.solution2(t,str));
    }
}

