package programmers;

import java.util.ArrayList;
import java.util.Arrays;

public class 두개뽑아서더하기 {

    public int[] solution(int[] numbers) {
        int[] answer;
        int num = 0;
        ArrayList<Integer> list = new ArrayList<>();
        Arrays.sort(numbers);

        for (int i = 0; i < numbers.length-1; i++) {
            for (int j = i+1; j < numbers.length; j++) {
                num = numbers[i] + numbers[j];
                if (!list.contains(num)) {
                    list.add(num);
                }
            }
        }
        answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
        Arrays.sort(answer);
        return answer; //11234 , 2 3 4 5 6 7
    }

    public static void main(String[] args) {
        두개뽑아서더하기 T = new 두개뽑아서더하기();
        for (int i : T.solution(new int[]{0,2,5,7})) {
            System.out.println(i);
        }
    }
}
