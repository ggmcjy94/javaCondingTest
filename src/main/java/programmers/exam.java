package programmers;

import java.util.ArrayList;

public class exam {

    public String solution(String phone_number) {
        String answer = "";
        for (int i = 0; i < phone_number.length(); i++) {
            if (i > phone_number.length() - 5) {
                answer += phone_number.charAt(i);
            } else {
                answer += "*";
            }
        }
        return answer;
    }


    public static void main(String[] args) {
    }
}
