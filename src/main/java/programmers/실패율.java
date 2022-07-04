package programmers;

import java.util.*;

public class 실패율 {

    public int[] solution(int N, int[] stages) {
        int[] answer = new int[N];
        int[] stageCount = new int[N];
        HashMap<Integer, Double> map = new HashMap<>();
        int total = stages.length;
        for (int i = 0; i < stages.length; i++) {
            if (stages[i] == N + 1) continue; // 마지막 스테이지를 클리어한 것은 제외
            stageCount[stages[i] - 1]++;
        }

        for (int i = 0; i < stageCount.length; i++) {
            if (total == 0) {
                map.put(i, 0d);
                continue;
            }
            map.put(i, (double) (stageCount[i] / (double)total));
            total -= stageCount[i];
        }

        for (int i = 0; i < N; i++) {
            double max = -1;
            int maxKey = 0;

            for (Integer key : map.keySet()) {
                if (max < map.get(key)) {
                    max = map.get(key);
                    maxKey = key;
                }
            }
            answer[i] = maxKey + 1;
            map.remove(maxKey);
        }
        return answer;
    }

    public static void main(String[] args) {
        실패율 T = new 실패율();

        for (int i : T.solution(5, new int[]{2, 1, 2, 6, 2 ,4 ,3 ,3})) {
            System.out.println(i);
        }

    }

}
