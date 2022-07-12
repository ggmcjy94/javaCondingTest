package programmers.level1;

import java.util.ArrayList;

public class 모의고사 {

    public int[] solution(int[] answers) {
        int[] answer;
        int[] one = {1,2,3,4,5};
        int[] two = {2,1,2,3,2,4,2,5};
        int[] three = {3,3,1,1,2,2,4,4,5,5};
        int cnt1 = 0,cnt2 = 0,cnt3 = 0;
        for (int i = 0; i < answers.length; i++) {
            if (one[i % one.length] == answers[i]) cnt1++;
            if (two[i % two.length] == answers[i]) cnt2++;
            if (three[i % three.length] == answers[i]) cnt3++;
        }
        int max = Math.max(Math.max(cnt1, cnt2), cnt3);
        ArrayList<Integer> list = new ArrayList<>();
        if (max == cnt1)list.add(1);
        if (max == cnt2)list.add(2);
        if (max == cnt3)list.add(3);
        answer = new int[list.size()];

        for (int i = 0; i < answer.length; i++) {
            answer[i] = list.get(i);
        }
        return answer;
    }


}
