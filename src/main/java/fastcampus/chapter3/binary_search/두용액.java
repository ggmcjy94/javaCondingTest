package fastcampus.chapter3.binary_search;

import java.io.*;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class 두용액 {

    static FastReader sc = new FastReader();
    static StringBuilder sb = new StringBuilder();
    static int lower_bound(int[] a, int l, int r, int target) {
        int res = r+1;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (a[mid] >= target) {
                res = mid;
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return res;
    }

    private static void solution(int[] A, int n) {
         int best_sum = Integer.MAX_VALUE;
         int v1 =0 , v2 =0;
         for (int left = 1; left <= n - 1; left++) {
             // A[left] 용액을 쓸 것이다. 고로 -A[left] 와 가장 가까운 용액을 자신의 오른쪽 구간에서 찾자.
             int candidate = lower_bound(A, left + 1, n, -A[left]);

             // A[candidate - 1] 와 A[candidate] 중에 A[left] 와 섞었을 때의 정보를 정답에 갱신시킨다.
             // 1. A[left] + A[candidate - 1]
             if (left < candidate - 1 && Math.abs(A[left] + A[candidate - 1]) < best_sum) {
                 best_sum = Math.abs(A[left] + A[candidate - 1]);
                 v1 = A[left];
                 v2 = A[candidate - 1];
             }

             // 2. A[left] + A[candidate]
             if (candidate <= n && Math.abs(A[left] + A[candidate]) < best_sum) {
                 best_sum = Math.abs(A[left] + A[candidate]);
                 v1 = A[left];
                 v2 = A[candidate];
             }
         }
         sb.append(v1).append(' ').append(v2);
         System.out.println(sb);
    }

    public static void main(String[] args) {
        int N = sc.nextInt();
        int[] A = new int[N+1];
        for (int i = 1; i <= N; i++) {
            A[i] = sc.nextInt();
        }
        Arrays.sort(A, 1, N + 1);
        // -99 -2 -1 4 98
        solution(A, N);

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
