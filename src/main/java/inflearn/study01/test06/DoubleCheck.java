package inflearn.study01.test06;
import java.util.Arrays;
import java.util.Scanner;

/**
 * 중복 확인 문제
 */
public class DoubleCheck {

    public static void main(String[] args) {
        DoubleCheck dc = new DoubleCheck();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i < n; i++) arr[i] = kb.nextInt();

        System.out.println(dc.solution2(n, arr));
    }

    private String solution2(int n, int[] arr) { //success
        String answer = "U";
        Arrays.sort(arr);//오름차순
        for (int i = 0; i < n-1; i++) {
            if (arr[i] == arr[i+1]) return "D";
        }
        return answer;
    }

    private String solution(int n, int[] arr) { // Time Limit Exceeded
        String answer = "U";
        int count = 0;
        for (int i = 0; i < n - 1; i++) {
            for (int j = i+1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }
        }
        if (count > 0) answer = "D";
        return answer;
    }
}
