package solved.bronze1;

import java.util.Scanner;

public class 팰린드롬수 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            int n = sc.nextInt();
            if (n == 0) break;
            StringBuilder sb = new StringBuilder(String.valueOf(n)).reverse();
            int i = Integer.parseInt(String.valueOf(sb));
            if (n == i) {
                System.out.println("yes");
            } else {
                System.out.println("no");
            }
        }
    }
}
