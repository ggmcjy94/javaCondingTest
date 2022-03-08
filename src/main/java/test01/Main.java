package test01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    // 1번 문제
    public int solution(String s, char c) {
        int answer = 0;
        s = s.toUpperCase();
        c = Character.toUpperCase(c);
        for (char aChar : s.toCharArray()) {
            if (aChar == c) {
                answer++;
            }
        }
        return answer;
    }

    // 2번 문제
    public String solution2(String s) {
        String answer = "";
        for (char aChar : s.toCharArray()) {
            if (Character.isLowerCase(aChar)) {
                answer += Character.toUpperCase(aChar);
            } else {
                answer += Character.toLowerCase(aChar);
            }
        }
        return answer;
    }
    // 3번 문제
    public String solution3(String s) {
        String answer = "";
        int m = Integer.MIN_VALUE, pos;
        while ((pos = s.indexOf(' ')) != -1) {
            String tmp = s.substring(0, pos);
            int len = tmp.length();
            if (len > m) {
                m = len;
                answer = tmp;
            }
            s = s.substring(pos+1);
        }
        if (s.length() > m) answer=s;
        return answer;
    }
    public String solution3_1(String s) {
        String answer = "";
        int m = Integer.MIN_VALUE;
        for (String s1 : s.split(" ")) {
            int len = s1.length();
            if (len > m) {
                m = len;
                answer = s1;
            }
        }
        return answer;
    }

    // 4번 문제
    public ArrayList<String> solution4(String[] str) {
        ArrayList<String> answer = new ArrayList<>();
        for (String s : str) {
            answer.add(new StringBuilder(s).reverse().toString());
        }
        return answer;
    }

    public static void main(String[] args) {
        Main ex = new Main();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] str = new String[n];
        for (int i = 0; i < n; i++) {
            str[i] = sc.next();
        }
        for (String s : ex.solution4(str)) {
            System.out.println(s);
        }
    }
}
