package solved.silver5;

import java.util.Scanner;

public class 그룹단어체커 {

    static Scanner sc = new Scanner(System.in);

    static boolean check() {
        String str = sc.next();
        boolean[] check = new boolean[26];
        int prev = 0;
        for (int i = 0; i < str.length(); i++) {
            int now = str.charAt(i);
            if (prev != now) {
                if (check[now - 'a'] == false) {
                    check[now - 'a'] = true;
                    prev = now;
                } else {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {

        int n = sc.nextInt();
        int count = 0;

        for (int i = 0; i < n; i++) {
            if (check() == true) count++;
        }

        System.out.println(count);
    }
}
