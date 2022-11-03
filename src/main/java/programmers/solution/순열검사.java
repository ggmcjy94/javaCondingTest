package programmers.solution;


import java.util.Arrays;

public class 순열검사 {

    public boolean solution(int[] arr) {
        boolean answer = true;
        Arrays.sort(arr);
        int size = arr.length;
        for (int i = 1; i <= size; i++) {
            if (arr[i-1] != i) {
                answer = false;
            }
        }
        return answer;
    }
}
