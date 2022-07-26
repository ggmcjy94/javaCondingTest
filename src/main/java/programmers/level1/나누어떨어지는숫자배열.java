package programmers.level1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class 나누어떨어지는숫자배열 {

    public int[] solution(int[] arr, int divisor) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % divisor == 0) {
                list.add(arr[i]);
            }
        }
        if (list.size() == 0) return new int[]{-1};
        int[] answer = new int[list.size()];
        Collections.sort(list);
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
        return answer;
    }
}
