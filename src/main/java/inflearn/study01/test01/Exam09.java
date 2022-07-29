package inflearn.study01.test01;

import java.util.Scanner;

//회문 문자열
public class Exam09 {
    public int solution(String str) {
        int answer = 0;
        StringBuilder target = new StringBuilder();
        str = str.toUpperCase();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (!Character.isAlphabetic(c)) {
                target.append(c);
            }
        }
        answer = Integer.parseInt(String.valueOf(target));
        return answer;
    }

    public int solution2(String s) {
        int answer = 0;
        for (char x : s.toCharArray()) {
            if (x >= 48 && x <= 57) answer = answer*10+(x-48);
        }
        return answer;
    }

    public int solution3(String s) {
        String answer = "";
        for (char x : s.toCharArray()) {
            if (Character.isDigit(x)) answer+=x;
        }
        return Integer.parseInt(String.valueOf(answer));
    }

    public static void main(String[] args) {
        Exam09 exam07 = new Exam09();
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int solution = exam07.solution3(str);
        System.out.println(solution);
    }
}

