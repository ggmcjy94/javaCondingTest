package fastcampus.chapter3.binary_search;

import java.util.Arrays;
import java.util.Scanner;

public class 두수의합 {

    static int solution(int[] arr , int target) {
        int l = 0;
        int r = arr.length-1;
        int mid = 0;
        while (l <= r) {
            mid = (l + r) / 2;
            if (arr[mid] == target) {
                return 1;
            } else if  (arr[mid] < target) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        // 1 2 3 5 7 9 10 11 12
        // 13
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int x = sc.nextInt();
        Arrays.sort(arr);
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += solution(arr, x-arr[i]);
        }
        System.out.println(sum/2);
    }
}
