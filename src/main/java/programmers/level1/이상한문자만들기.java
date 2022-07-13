package programmers.level1;

public class 이상한문자만들기 {

    public String solution(String s) {
        String answer = "";
        String[] str = s.split(" ");
        for (String s1 : str) {
            for (int i = 0; i < s1.length(); i++) {
                if (i % 2 == 0) answer += s1.toUpperCase();
                else answer += s1.toLowerCase();
            }
        }
        System.out.println(answer);
        return answer;
    }
}
