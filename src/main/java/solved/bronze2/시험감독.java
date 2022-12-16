package solved.bronze2;

import fastcampus.chapter3.brute_force.완전탐색02;

import java.awt.*;
import java.io.*;
import java.util.Scanner;
import java.util.StringTokenizer;

public class 시험감독 {


    public static void main(String[] args) {
        FastReader sc = new FastReader();
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]= sc.nextInt();
        }

        long cnt = 0;
        int b = sc.nextInt();
        int c = sc.nextInt();
//        for (int i : arr) {
//            if (i - b <= 0)  {
//                cnt = cnt+1;
//            }
//            else if (i - (b + c) <= 0)  {
//                cnt = cnt+2;
//            } else {
//                i = i - b;
//                cnt = 1;
//                while (true) {
//                    if (i >= 0) {
//                        i = i - c; // 1
//                        cnt = cnt + 1;
//                    } else {
//                        break;
//                    }
//                }
//            }
//            sum += cnt;
//            cnt = 0;
//        }

        for (int i : arr) {
            long result = 0;
            if (i <= b) {
                cnt++;
                continue;
            } else {
                cnt++;
                i -= b;
                if (i % c == 0) cnt += i / c;
                else if (i % c != 0) cnt += i/c + 1;
            }
        }
        System.out.println(cnt);
    }


    static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        public FastReader() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        public FastReader(String s) throws FileNotFoundException {
            br = new BufferedReader(new FileReader(new File(s)));
        }

        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        long nextLong() {
            return Long.parseLong(next());
        }

        double nextDouble() {
            return Double.parseDouble(next());
        }

        String nextLine() {
            String str = "";
            try {
                str = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
    }
}
