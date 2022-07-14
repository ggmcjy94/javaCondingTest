package programmers.level2;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class 기능개발 {

    public int[] solution(int[] progresses, int[] speeds) {
        Queue<Integer> q = new LinkedList<>();

        for (int i = 0; i < speeds.length; i++) {
            // 남은 작업일을 계산하여 큐에 추가
            q.offer((100 - progresses[i]) / speeds[i] + ((100 - progresses[i]) % speeds[i] == 0 ? 0 : 1) );
        }

        int cnt = 1;        // 현재 카운트를 위해 1로 초기화
        int now = q.poll(); // 첫번째 항목을 꺼냄
        ArrayList<Integer> arr = new ArrayList<>(); // 결과를 담을 배열

        while(!q.isEmpty()) {
            int next = q.poll();    // 현재 작업일과 다음 작업일을 비교하기 위해 값을 꺼냄
            if (now >= next) cnt++;  // 만일 현재 작업일이 더 많을 경우 cnt증가
            else {                   // 현재 작업일이 작은경우
                arr.add(cnt);       // 배열에 계산한 cnt추가
                now = next;         // 현재 작업일을 next로 교체
                cnt = 1;            // cnt초기화
            }
        }
        arr.add(cnt);               // 마지막 cnt는 추가가 안됨으로 따로 추가
        int[] answer = new int[arr.size()];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = arr.get(i);
        }
        return answer;
    }
}
