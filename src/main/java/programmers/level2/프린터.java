package programmers.level2;

import java.util.Collections;
import java.util.PriorityQueue;

public class 프린터 {

    public int solution(int[] priorities, int location) {
        int answer = 0;
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for (int i : priorities) {
            pq.offer(i);
        }

        while (!pq.isEmpty()) {
            for (int i = 0; i < priorities.length; i++) {
                if (pq.peek() == priorities[i]) { //
                    pq.poll();
                    answer++;
                    if (location == i) return answer;
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        프린터 T = new 프린터();
        System.out.println(T.solution(new int[]{1, 1, 9, 1, 1, 1}, 0));
    }
}
