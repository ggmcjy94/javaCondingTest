package programmers.level2;

import java.util.Arrays;

public class 최솟값만들기 {

    public int solution(int[] A, int[] B)
    {
        int answer = 0;
        Arrays.sort(A); // 124
        Arrays.sort(B); // 445

        for (int i = 0; i < A.length; i++) {
            answer += A[i] * B[A.length-1-i];
        }
        return answer;
    }
}
