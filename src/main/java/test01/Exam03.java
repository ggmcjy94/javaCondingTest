package test01;

import java.util.Scanner;

public class Exam03 {
    public String solution(String str) {
        String answer = "";
        int m = Integer.MIN_VALUE, pos;
        while ((pos = str.indexOf(' ')) != -1) {
            String tmp = str.substring(0, pos);
            int len = tmp.length();
            if (len > m) {
                m = len;
                answer = tmp;
            }
            str = str.substring(pos+1);
        }
        if (str.length() > m) answer=str;
        return answer;
    }
    public static void main(String[] args) {
        Exam03 ex = new Exam03();
        Scanner sc = new Scanner(System.in);
        // next는 공백을 기준으로 한 단어 또는 한 문자씩 입력받는다.
        // 쉽게 말해 공백 이후의 글자는 날라간다?! nextLine은 문장 전체가 공백 포함해서 통으로 입력됨
        String str = sc.nextLine();
        System.out.println(ex.solution(str));
    }
}

//String[] s = str.split(" ");
//        for (String x : s) {
//            int len = x.length();
//            if (len > m) {
//                m = len;
//                answer = x;
//            }
//        }
