package fastcampus.chapter3.brute_force;

import java.io.*;
import java.util.StringTokenizer;

// N M 문제 중복 수열
public class 완전탐색 {
    static int N, M;
    static int[] selected, used;


    // n m 1
    static void rec_func1_1 (int k) {
        if (k == M + 1) {
            for (int i = 1; i <= M; i++) {
                sb.append(selected[i]).append(' ');
            }
            sb.append('\n');
        } else {
            for (int c = 1; c <= N; c++) {
                boolean isUsed = false;
                for (int i = 1; i < k; i++) {
                    if (c == selected[i]) isUsed = true;
                }
                if (isUsed == false) {
                    selected[k] = c;
                    rec_func1_1(k + 1);
                    selected[k] = 0;
                }
            }
        }
    }
    static void rec_func1_2 (int k) {
        if (k == M + 1) {
            for (int i = 1; i <= M; i++) {
                sb.append(selected[i]).append(' ');
            }
            sb.append('\n');
        } else {
            for (int c = 1; c <= N; c++) {
                if (used[c] == 1) continue;
                selected[k] = c;
                used[c] = 1;
                rec_func1_2(k + 1);
                selected[k] = 0;
                used[c] = 0;
            }
        }
    }

    // n m 2
    static void rec_func2(int k) {
         if (k == M + 1) {
             for (int i = 1; i <= M; i++) {
                 sb.append(selected[i]).append(" ");
             }
             sb.append('\n');
         } else {

             for (int cand = 1; cand <= N; cand++) {
                 selected[k] = cand;
                 rec_func2(k+1);
                 selected[k] = 0;
             }
         }
    }


    // n m 3
    static void rec_func3(int k) {
        if (k == M + 1) {
            for (int i = 1; i <= M; i++) {
                sb.append(selected[i]).append(' ');
            }
            sb.append('\n');
        } else {
            for (int cand = selected[k - 1] + 1; cand <= N; cand++) {
                selected[k] = cand;
                rec_func3(k+1);
                selected[k] = 0;
            }
        }
    }

    // n m 4
    static void rec_func4(int k) {
        if (k == M + 1) {
            for (int i = 1; i <= M; i++) {
                sb.append(selected[i]).append(" ");
            }
            sb.append('\n');
        } else {
            int start = selected[k - 1];
            if (start == 0) start = 1;
            for (int cand = start; cand <= N; cand++) {
                selected[k] = cand;
                rec_func3(k+1);
                selected[k] = 0;
            }
        }
    }


    public static void main(String[] args) {
        input();
        rec_func1_2(1);
        System.out.println(sb.toString());
    }

    static StringBuilder sb = new StringBuilder();

    static void input() {
        FastReader scan = new FastReader();
        N = scan.nextInt();
        M = scan.nextInt();
        selected = new int[M + 1];
        used = new int[M+1];
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
