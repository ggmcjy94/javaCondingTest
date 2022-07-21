package programmers.level1;


import java.util.Arrays;
import java.util.Collections;

public class 문자열내림차순으로배치하기 {

    public String solution(String s) {
        char[] chars = s.toCharArray();
        Arrays.sort(chars);
        StringBuilder sb = new StringBuilder(new String(chars, 0, chars.length));
        return sb.reverse().toString();
    }
}
