package programmers.level1;

import java.util.*;

public class 짝꿍 {

    public String solution(String X, String Y) {
        String answer = "";
        PriorityQueue<Integer> queue = new PriorityQueue<>(Comparator.reverseOrder());
        //12321 42531z
        

        for (int i = 0; i < Y.length(); i++) {
            if (X.indexOf(Y.charAt(i)) >= 0) {
                queue.add(Integer.parseInt(String.valueOf(Y.charAt(i))));
            }
        }

        int sum = 0;
        while (!queue.isEmpty()) {
            Integer poll = queue.poll();
            sum += poll;
            answer += String.valueOf(poll);
        }
        if(answer.equals("")) return "-1";
        if(sum == 0) return "0";
        return answer;
    }
}
