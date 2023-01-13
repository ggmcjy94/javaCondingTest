package solved.bronze2;

import java.util.Arrays;
import java.util.Scanner;

public class 팰린드롬인지확인하기 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String r = "";
        char[] chars = s.toCharArray();
        for (int i = chars.length-1; i >= 0; i--) {
            r += chars[i];
        }
        if (s.equals(r)) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }
}
