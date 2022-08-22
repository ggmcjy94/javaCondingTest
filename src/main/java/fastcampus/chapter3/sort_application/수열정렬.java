package fastcampus.chapter3.sort_application;

import java.util.Arrays;
import java.util.Scanner;

public class 수열정렬 {

    static class Number implements Comparable<Number>{

        Integer Id;
        Integer value;


        @Override
        public int compareTo(Number o) {
            if (this.value != o.value) return this.value - o.value;
            return this.Id - o.Id;
        }
    }

    private static int[] solution(int n, int[] p, Number[] arr) {
        Arrays.sort(arr);

        for (int i = 0; i < n; i++) {
            p[arr[i].Id] = i;
        }
        return p;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        Number[] B = new Number[N];
        int[] P = new int[N];
        for (int i = 0; i < N; i++) {
           B[i] = new Number();
           B[i].value = sc.nextInt();
           B[i].Id = i;

        }
        for (int i : solution(N,P,B)) {
            System.out.print(i + " ");
        }
    }
}
