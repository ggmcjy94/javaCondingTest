package programmers.level1;

import java.util.ArrayList;

import java.util.Collections;
import java.util.List;

public class 문자열내맘대로정렬하기 {

    public String[] solution(String[] strings, int n) {

        List<String> arr = new ArrayList<>();
        for (int i = 0; i < strings.length; i++) {
            arr.add("" + strings[i].charAt(n) + strings[i]);
        }
        Collections.sort(arr);
        String[] answer = new String[arr.size()];
        for (int i = 0; i < arr.size(); i++) {
            answer[i] = arr.get(i).substring(1, arr.get(i).length());
        }
        return answer;
    }
}
