package back;

import java.util.Arrays;
import java.util.Scanner;

public class Sorted1 {

    private int[][] solution(int n, int[][] arr) {
        int[][] answer;
        Arrays.sort(arr, (o1,o2) -> {
            if (o1[0] == o2[0])
                return Integer.compare(o1[1], o2[1]);
            else
                return Integer.compare(o1[0], o2[0]);
        });
        answer = arr;
        return answer;
    }

    public static void main(String[] args) {
        Sorted1 sorted1 = new Sorted1();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][2];

        for (int i = 0; i < n; i++) {
            arr[i][0] = sc.nextInt();
            arr[i][1] = sc.nextInt();
        }

        int[][] solution = sorted1.solution(n, arr);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <2; j++) {
                System.out.print(solution[i][j] +" ");
            }
            System.out.println();
        }

    }


}
