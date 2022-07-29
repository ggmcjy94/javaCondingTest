package inflearn.study01.test01;

import java.util.Scanner;

//회문 문자열
public class Exam10 {
    public int[] solution(String str, char c) {
        int[] answer = new int[str.length()];
        int p = 1000;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == c) {
                p = 0;
            } else {
                p++;
            }
            answer[i] = p;
        }
        p = 1000;
        for (int i = str.length()-1; i >= 0; i--) {
            if (str.charAt(i) == c) {
                p = 0;
            } else {
                p++;
            }
            answer[i] = Math.min(answer[i], p);
        }
        return answer;
    }


    public int[] solution2(String str, char c) {
        int[] answer = new int[str.length()];
        int p = 1000;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == c) {
                p = 0;
            } else {
                p++;
            }
            answer[i] = p;
        }
        for (int i = str.length()-1; i >= 0; i--) {
            if (str.charAt(i) == c) {
                p = 0;
            } else {
                p++;
            }
            answer[i] = Math.min(answer[i], p);
        }
        return answer;
    }

    public static void main(String[] args) {
        Exam10 exam07 = new Exam10();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char c = sc.next().charAt(0);
        for (int x : exam07.solution2(str, c)) {
            System.out.print(x + " ");
        }
    }
}

