package fastcampus.chapter3.binary_search;

import java.util.Arrays;
import java.util.Scanner;

public class 수찾기 {

 // 1 2 3 4 5
    static int solution(int[] A, int num) {
        int left = 0;
        int right = A.length-1;
        int mid = 0;
        while (left <= right) {
            mid = (left+right)/2;
            if (A[mid] == num) return 1;
            else if (A[mid] > num) right = mid-1;
            else if (A[mid] < num) left = mid+1;
        }
        return 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }
        Arrays.sort(A);
        int M = sc.nextInt();
        int[] B = new int[M];
        for (int i = 0; i < M; i++) {
            B[i] = sc.nextInt();
        }
        for (int i = 0; i < M; i++) {
            System.out.println(solution(A, B[i]));
        }
    }
}
