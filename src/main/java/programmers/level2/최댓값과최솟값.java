package programmers.level2;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

public class 최댓값과최솟값 {

    public String solution(String s) {
        String answer = "";
        String[] split = s.split(" ");
        List<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < split.length; i++) {
            list.add(Integer.parseInt(split[i]));
        }
        Collections.sort(list);
        answer = list.get(0) + " " + list.get(list.size()-1);
        return answer;
    }
}
