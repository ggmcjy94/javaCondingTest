package solved.silver5;


import java.io.*;

import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class 숫자카드 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        int[] arrN = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());

        for(int i = 0; i<N; i++) {
            arrN[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arrN);

        int M = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i<M; i++) {
            int m = Integer.parseInt(st.nextToken());
            int first= 0;
            int last = N-1;
            boolean flag = false;
            while(first<=last) {
                int mid = (first+last)/2;
                int targetN = arrN[mid];
                if(targetN==m) {
                    flag = true;
                    break;
                }
                if(targetN > m) {
                    last = mid - 1;
                }
                else {
                    first = mid + 1;
                }
            }
            if(flag) bw.write(1 + " ");
            else bw.write(0 + " ");

        }
        bw.flush();
        bw.close();
        br.close();
//        Scanner sc = new Scanner(System.in);
//        int N = sc.nextInt();
//        int[] arr = new int[N];
//        for (int i = 0; i < N; i++) {
//            arr[i] = sc.nextInt();
//        }
//        Arrays.sort(arr);
//        int M = sc.nextInt();
//        for (int i = 0; i < M; i++) {
//            int m = sc.nextInt();
//            int left = 0;
//            int right = N - 1;
//            boolean flag = false;
//            while (left <= right) {
//                int mid = (left+right)/2;
//                int target = arr[mid];
//                if (target == m) {
//                    flag = true;
//                    break;
//                }
//                if (target > m) {
//                    right = mid -1;
//                } else {
//                    left = mid+1;
//                }
//            }
//            if (flag) System.out.print(1 + " ");
//            else System.out.print(0 + " ");
//        }
    }

}