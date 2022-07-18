package programmers.level1;

public class 나머지가1이되는수찾기 {

    public int solution(int n) {
        int answer = Integer.MAX_VALUE;
        for (int i = 1; i <= n; i++) {
            if (n % i == 1) {
                answer = Math.min(answer, i);
            }
        }
        return answer;
    }
}
