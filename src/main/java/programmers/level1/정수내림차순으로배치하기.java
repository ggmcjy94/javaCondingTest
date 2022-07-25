package programmers.level1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class 정수내림차순으로배치하기 {

    public long solution(long n) {
        long answer = 0;
        String c = "";
        String s = String.valueOf(n);
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            list.add(Integer.parseInt(String.valueOf(s.charAt(i))));
        }
        Collections.sort(list, Collections.reverseOrder());
        for (int i = 0; i < list.size(); i++) {
            c += String.valueOf(list.get(i));
        }
        answer = Long.parseLong(c);
        return answer;
    }
}
