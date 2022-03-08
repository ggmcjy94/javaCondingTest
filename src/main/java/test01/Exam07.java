package test01;

import java.util.Scanner;

//회문 문자열
public class Exam07 {
    public String solution(String str) {
        String answer = "YES";
        str = str.toUpperCase();
        int len = str.length();

        for (int i = 0; i < len/2; i++) {
            //G O O G // 0 != 4-i-1
            if (str.charAt(i) != str.charAt(len-i-1)) answer = "NO";
        }

        return answer;
    }
    public String solution2(String str) {
        String answer = "YES";
        String tmp = new StringBuilder(str).reverse().toString();
        //equalsIgnoreCase 대소문자 무시
        if (!str.equalsIgnoreCase(tmp)) answer="NO";
        return answer;
    }
    public static void main(String[] args) {
        Exam07 exam07 = new Exam07();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String solution = exam07.solution2(str);
        System.out.println(solution);
    }
}

