package solved.bronze4;

import java.util.ArrayList;
import java.util.Scanner;

public class 입실관리 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<String> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String next = sc.next();
            String srr = "";
            for (char c : next.toCharArray()) {
                if (Character.isUpperCase(c)) {
                    srr += Character.toLowerCase(c);
                } else {
                    srr += c;
                }
            }
            arr.add(srr);
        }
        for (String s : arr) {
            System.out.println(s);
        }
    }
}
