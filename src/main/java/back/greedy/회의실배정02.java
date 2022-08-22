package back.greedy;

import java.util.Arrays;
import java.util.Scanner;

public class 회의실배정02 {
    private int solution(int[][] dataList) {
        Arrays.sort(dataList, (o1, o2) -> {
            if (o1[1] == o2[1]) {
                return o1[0] - o2[0];
            }
            return o1[1] - o2[1];
        });

        int answer = 0;
        int e = 0;

        for (int i = 0; i < dataList.length; i++) {
            if (e <= dataList[i][0]) {
                e = dataList[i][1];
                answer++;
            }
        }
        return answer;
    }
    public static void main(String[] args) {
        회의실배정02 T = new 회의실배정02();
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[][] arr = new int[N][2];
        for (int i = 0; i < N; i++) {
            arr[i][0] = sc.nextInt();
            arr[i][1] = sc.nextInt();
        }
        System.out.println(T.solution(arr));
    }
}
