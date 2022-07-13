package programmers.level1;

public class 자릿수더하기 {

    public int solution(int n) {
        int answer = 0;
        String s = String.valueOf(n);
        for (char c : s.toCharArray()) {
            answer += Integer.parseInt(String.valueOf(c));
        }

        return answer;
    }
}
