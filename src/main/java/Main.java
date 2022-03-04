import java.util.Scanner;

public class Main {
    public String solution(String str) {
        String answer = "";
        int min = Integer.MIN_VALUE;
        String[] split = str.split(" ");
        for (String s : split) {
            int len = s.length();
            if (len > min) {
                min = len;
                answer = s;
            }
        }
        return answer;
    }
    public static void main(String[] args) {
        Main ex = new Main();
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        System.out.println(ex.solution(str));
    }
}
