package programmers.level1;

public class 콜라츠추측 {

    public int solution(int num) {
        int answer = 0;
        while (true) {
            if (answer >= 500) return -1;
            if (num == 1) break;
            if (num % 2 == 0) {
                num = num / 2;
            } else if (num % 2 == 1) {
                num = num * 3 + 1;
            }
            answer++;
        }
        return answer;
    }
}
