package inflearn.study01.test01;

import java.util.Scanner;

//회문 문자열
public class Exam11 {
    public String solution(String str) {
        String answer = "";
        str = str.toUpperCase();
        str = str + " ";
        int cnt = 1;
        for (int i = 0; i < str.length()-1; i++) {
            if (str.charAt(i) == str.charAt(i+1)) {
                cnt++;
            } else {
                answer += str.charAt(i);
                if (cnt > 1) {
                    answer += String.valueOf(cnt);
                }
                cnt = 1;
            }
        }
        return answer;
    }

    public String solution2(String str) {
        String answer = "";
        str = str.toUpperCase();
        str = str + " ";
        int cnt = 1;
        for (int i = 0; i < str.length()-1; i++) {
            if (str.charAt(i) == str.charAt(i+1)) {
                cnt++;
            } else {
                answer += str.charAt(i);
                if (cnt > 1) {
                    answer += String.valueOf(cnt);
                }
                cnt = 1;
            }
        }
        return answer;
    }



    public static void main(String[] args) {
        Exam11 exam07 = new Exam11();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(exam07.solution(str));
    }
}

