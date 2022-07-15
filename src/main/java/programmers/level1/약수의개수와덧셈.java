package programmers.level1;

public class 약수의개수와덧셈 {

    public int solution(int left, int right) {
        int answer = 0;
        int num = 1, cnt = 0;
        for (int i = left; i <= right; i++) {
            while (num <= i) {
                if (i % num == 0) {
                    cnt++;
                }
                num++;
            }
            num = 1;
            if (cnt % 2 == 0) {
                answer += i;
            } else {
                answer -= i;
            }
            cnt = 0;
        }
        return answer;
    }

    public static void main(String[] args) {
        약수의개수와덧셈 T = new 약수의개수와덧셈();
        System.out.println(T.solution(13 , 17));
    }
}
