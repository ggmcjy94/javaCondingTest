package programmers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class 없는숫자더하기 {

    public int solution(int[] numbers) {
        int answer = 0;
        ArrayList<Integer> answerList = new ArrayList<>();
        Arrays.sort(numbers);
        for (int i = 0; i < 10; i++) {
            answerList.add(i);
        }
        for (Integer num : numbers) {
            answerList.remove(num);
        }

        for (Integer integer : answerList) {
            answer += integer;
        }

        return answer;
    }
    public static void main(String[] args) {
        없는숫자더하기 T = new 없는숫자더하기();
        System.out.println(T.solution(new int[]{1,2,3,4,6,7,8,0}));
    }
}
