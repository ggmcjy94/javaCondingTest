package inflearn.study01.test06;


import java.util.Arrays;
import java.util.Scanner;

/**
 * 이분검색 문제
 */
public class BinarySearch {


    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int m = kb.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = kb.nextInt();
        BinarySearch b = new BinarySearch();
        System.out.println(b.solution2(n,m,arr));
    }

    private int solution(int n, int m, int[] arr) {
        Arrays.sort(arr);
        for (int i = 0; i < n; i++) {
            if (arr[i] == m) {
                return i + 1;
            }
        }
        return 0;
    }

    private int solution2(int n, int m, int[] arr) {
        int answer = 0;
        Arrays.sort(arr); //12 23 32 57 65 81 87 99
        int lt = 0, rt = n - 1;
        while (lt <= rt) {
            int mid = (lt+rt)/2;
            if (arr[mid] == m) {
                answer = mid + 1;
                break;
            }
            if (arr[mid] > m) {
                rt = mid - 1;
            } else {
                lt = mid + 1;
            }
        }
        return answer;
    }

}
