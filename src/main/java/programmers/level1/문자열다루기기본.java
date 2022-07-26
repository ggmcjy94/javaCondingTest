package programmers.level1;

public class 문자열다루기기본 {

    public boolean solution(String s) {
        boolean answer = true;
        if(s.length() != 4 && s.length() != 6) return false;
        for (char c : s.toCharArray()) {
            if (Character.isAlphabetic(c)) {
                System.out.println(c);
                return false;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        문자열다루기기본 T = new 문자열다루기기본();
        System.out.println(T.solution("1B23"));
    }
}
