import java.util.Scanner;

//회문 문자열
public class Exam08 {
    public String solution2(String str) {
        String answer = "YES";
        str = str.toUpperCase().replaceAll("[^A-Z]", "");
        int len = str.length();
        for (int i = 0; i < len/2; i++) {
            if (str.charAt(i) != str.charAt(len - i - 1)) answer = "NO";
        }
        return answer;
    }
    public String solution(String str) {
        String answer = "NO";
        str = str.toUpperCase().replaceAll("[^A-Z]", "");
        String tmp = new StringBuilder(str).reverse().toString();
        if (str.equals(tmp)) answer = "YES";
        return answer;
    }


    public static void main(String[] args) {
        Exam08 exam07 = new Exam08();
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String solution = exam07.solution2(str);
        System.out.println(solution);
    }
}

