package test06;

import java.util.Scanner;

public class BubbleSort {


    public int[] solution(int n, int[] arr) {
        for (int i = 0; i <n-1; i++) {
            System.out.println("i : "+i);
            for (int j = 0; j<n-i-1; j++) {
                System.out.println("j : " + j);
                if (arr[j] > arr[j+1]) {
                    int tmp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = tmp;
                }
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        BubbleSort b = new BubbleSort();
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
