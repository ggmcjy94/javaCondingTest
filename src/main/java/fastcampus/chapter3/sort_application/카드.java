package fastcampus.chapter3.sort_application;

import java.util.*;

public class 카드 {

    private static long solution (long[] arr) {
        HashMap<Long, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }
        List<Map.Entry<Long, Integer>> entries = new LinkedList<>(map.entrySet());
        entries.sort((o1, o2) -> {
            if (o1.getValue() == o2.getValue())  {
                if (o1.getKey() > o2.getKey()) {
                    return 1;
                }
            }
            return o2.getValue() - o1.getValue();
        });
        return entries.get(0).getKey();
    }

    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        long[] arr = new long[N];
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextLong();
        }
        System.out.println(solution(arr));
    }

    private static long pro(long[] arr, int N) {
        Arrays.sort(arr, 0, N);
        long mode = arr[0];
        int modeCnt = 1, curCnt = 1;

        for (int i = 1; i < N; i++) {
            if (arr[i] == arr[i-1]) {
                curCnt++;
            } else {
                curCnt = 1;
            }
            if (modeCnt < curCnt) {
                modeCnt = curCnt;
                mode = arr[i];
            }
        }
        return mode;
    }
}
