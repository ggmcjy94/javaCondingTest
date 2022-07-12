package programmers.level2;

public class 문자열압축 {

    public int solution(String s) {
        int answer = Integer.MAX_VALUE;
        int len = s.length();

        if (len == 1) return 1;

        for (int split=1; split < len/2 + 1; split++) {
            String str = new String();
            String comp = s.substring(0, split);
            int cnt = 1;

            for (int i = split; i < len; i+=split) {
                if (i+split > len) {
                    if (cnt > 1) {
                        str += cnt + comp;
                    } else {
                        str += comp;
                    }
                    comp = s.substring(i);
                    cnt = 1;
                    continue;
                } else if (comp.equals(s.substring(i , i+split))) {
                    cnt++;
                } else {
                    if (cnt > 1) {
                        str += cnt + comp;
                    } else {
                        str += comp;
                    }
                    comp = s.substring(i, i+split);
                    cnt = 1;
                }
            }
            if (cnt > 1) {
                str += cnt + comp;
            } else {
                str += comp;
            }
            if (answer > str.length()) {
                answer = str.length();
            }
        }
        return answer;
    }


    public static void main(String[] args) {
        문자열압축 T = new 문자열압축();
        System.out.println(T.solution("abcabcabcabcdededededede"));
    }
}
