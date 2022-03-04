import java.util.ArrayList;
import java.util.Scanner;


public class Exam05 {
    public String solution(String str) {
        String answer = "";
        char[] chars = str.toCharArray();
        int lt =0 , rt = str.length() -1;
        while(lt < rt) {
            if (!Character.isAlphabetic(chars[lt])) {
                lt++;
            } else if (!Character.isAlphabetic(chars[rt])) {
                rt--;
            } else {
                char tmp = chars[lt];
                chars[lt] = chars[rt];
                chars[rt] = tmp;
                rt++;
                lt--;
            }
        }
        answer = String.valueOf(chars);
        return answer;
    }
    public static void main(String[] args) {
        Exam05 exam05 = new Exam05();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String solution = exam05.solution(str);
        System.out.println(solution);
    }
}

