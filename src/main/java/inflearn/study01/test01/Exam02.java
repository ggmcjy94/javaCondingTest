package inflearn.study01.test01;

import java.util.Scanner;

//대문자 65 ~ 90
// 소문자 97 ~ 122
public class Exam02 {
    public String solution(String str) {
        StringBuilder answer = new StringBuilder();

        for (char c : str.toCharArray()) {
            if (c >= 65 && c <= 90) answer.append((char) (c - 32));
            else answer.append((char) (c + 32));
        }
//        for (char c : str.toCharArray()) {
//            if (Character.isUpperCase(c)) {
//                answer += Character.toLowerCase(c);
//            } else if (Character.isLowerCase(c)) {
//                answer += Character.toUpperCase(c);
//            }
//        }
        return answer.toString();
    }
    public static void main(String[] args) {
        Exam02 e = new Exam02();
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        System.out.println(e.solution(str));
    }
}
