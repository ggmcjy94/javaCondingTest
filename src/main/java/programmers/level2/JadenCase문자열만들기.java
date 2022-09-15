package programmers.level2;


import java.util.ArrayList;

public class JadenCase문자열만들기 {

    public String solution(String s) {
        String answer = "";
        String[] split = s.toLowerCase().split("");
        boolean check = true;
        for (String s1 : split) {
            answer += check ? s1.toUpperCase() : s1;
            check = s1.equals(" ") ? true : false;
        }
        return answer;
    }
}
