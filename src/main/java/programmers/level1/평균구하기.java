package programmers.level1;

public class 평균구하기 {

    public double solution(int[] arr) {
        double answer = 0;
        for (int i : arr) {
            answer += i;
        }
        return answer/arr.length;
    }
}
