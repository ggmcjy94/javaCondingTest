package solved.bronze3;

import java.util.Scanner;

public class 열개씩끊어출력하기 {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.next();
        char[] chars = n.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (i < 10) {
                System.out.print(chars[i]);
            } else if (i % 10 == 0){
                System.out.println();
                System.out.print(chars[i]);
            } else {
                System.out.print(chars[i]);
            }

        }
    }
}
