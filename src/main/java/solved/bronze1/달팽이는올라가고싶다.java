package solved.bronze1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class 달팽이는올라가고싶다 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");


        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int V = Integer.parseInt(st.nextToken());
//        int cnt = 0;
//        while (V > 0) {
//            V = V - A;
//            cnt++;
//            if (V == 0) {
//                break;
//            } else {
//                V = V - B;
//            }
//        }

        int day = (V - B) / (A - B);
        if ((V - B) % (A - B) != 0) {
            day++;
        }
        System.out.println(day);
    }

    // 1 4
    // 2 3
    // 3 2
    // 4 0
}
