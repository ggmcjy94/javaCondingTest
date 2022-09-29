package programmers.level2;
import java.util.Arrays;
import java.util.Collections;

public class 구명보트 {

    public int solution(int[] people, int limit) {
        int answer=0 , min = 0;
        Arrays.sort(people);

        // 50 50 70 80

        for (int max = people.length-1; min <= max; max--){
            if (people[max] + people[min] > limit) {
                answer++;
            } else {
                answer++;
                min++;
            }
        }
        return answer;
    }
}
