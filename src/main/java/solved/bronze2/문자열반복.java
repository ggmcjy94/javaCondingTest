package solved.bronze2;

import java.util.HashMap;
import java.util.Scanner;

public class 문자열반복 {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] arr = new String[n];
        for (int i = 0; i < n; i++) {
            String r = "";
            int num = sc.nextInt();
            String str = sc.next();
            for (char c : str.toCharArray()) {
                for (int j = 0; j < num; j++) {
                    r += c;
                }
            }
            arr[i] = r;
        }

        for (String s : arr) {
            System.out.println(s);
        }
    }
}

