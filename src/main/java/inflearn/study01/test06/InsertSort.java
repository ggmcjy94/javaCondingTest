package inflearn.study01.test06;

import java.util.Scanner;

/**
 * 삽입정렬
 */
public class InsertSort {

    private int[] solution(int n, int[] arr) {

        for (int i = 1; i < n; i++) {
            int tmp = arr[i], j;
            for (j = i - 1; j >= 0; j--) {
                if (arr[j] > tmp) arr[j+1] = arr[j];
                else break;
            }
            arr[j+1] = tmp;
        }
        return arr;
    }

    public static void main(String[] args) {
        InsertSort b = new InsertSort();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i : b.solution(n, arr)) {
            System.out.print(i + " ");
        }
    }


}
