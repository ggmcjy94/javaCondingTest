package fastcampus.chapter3.sort_application;

import java.util.*;

public class 카드 {

    private static int solution (long[] arr) {
        HashMap<Long, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }
        List<Map.Entry<Long, Integer>> entries = new LinkedList<>(map.entrySet());
        entries.sort((o1, o2) -> {
            if (o1.getValue() == o2.getValue()) return (int) (o1.getKey() - o2.getKey());
            return o2.getValue() - o1.getValue();
        });
        return Math.toIntExact(entries.get(0).getKey());
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
}
