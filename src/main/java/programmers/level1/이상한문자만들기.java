package programmers.level1;

public class 이상한문자만들기 {

    public String solution(String s) {
        String answer = "";
        int idx = 0;
        String[] str = s.split("");
        for (String s1 : str) {
            System.out.println(s1);
        }
        for (int i = 0; i < str.length; i++) {
            if (" ".equals(str[i])) idx = 0;
            else {
                if (idx % 2 == 0) {
                    idx ++;
                    str[i] = str[i].toUpperCase();
                } else {
                    idx ++;
                    str[i] = str[i].toLowerCase();
                }
            }
            answer += str[i];
        }
        return answer;
    }
}
