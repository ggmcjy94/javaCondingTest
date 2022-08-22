package fastcampus.chapter3;

import java.util.Scanner;

//부분 수열의 합
public class 완전탐색04 {
    static int N, S, ans;
    static int[] nums;

    static void rec_func(int k, int value) {
        if (k == N + 1) {
            if (value == S) ans++;
        } else {
            //k 번째 원소를 포함 시킬 지 결정하고 재귀호출 해주기
            //include
            rec_func(k + 1, value + nums[k]);
            // not include
            rec_func(k + 1, value);
        }
    }

    static int factorialFunc(int n) {
        if (n == 0) return 1;
        if (n == 1) return 1;
        return n * factorialFunc(n - 1);
    }

    static int fiboFunc(int data) {
        Integer[] cache = new Integer[data + 1];
        cache[0] = 0;
        cache[1] = 1;
        for (int index = 2; index <= data; index++) {
            cache[index] = cache[index-1] + cache[index - 2];
        }
        return cache[data];
    }



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        S = sc.nextInt();
        nums = new int[N + 1];
        for (int i = 1; i <= N; i++) {
            nums[i] = sc.nextInt();
        }
        rec_func(1, 0);
        if (S == 0) {
            ans--;
        }
        System.out.println(ans);

        System.out.println(factorialFunc(5));
        System.out.println(fiboFunc(10));
    }
}
