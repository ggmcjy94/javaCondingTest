package solved.bronze1;

import java.util.*;

public class 세로읽기 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[][] ch = new char[5][15];
        int max = 0;

        for (int i = 0; i < ch.length; i++) {
            String str = sc.next();
            if (max < str.length()) max = str.length();
            for (int j = 0; j < str.length(); j++) {
                ch[i][j] = str.charAt(j);
            }
        }

        String sb = "";

        for (int i = 0; i < max; i++) {
            for (int j = 0; j < 5; j++) {
                if (ch[j][i] == '\0') continue;
                sb += ch[j][i];
            }
        }
        System.out.println(sb);
    }
}
