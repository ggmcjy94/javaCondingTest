package inflearn.study01.test02;

import java.util.ArrayList;
import java.util.Scanner;

public class Exam26 {
    private boolean isPrime(int num) {
        if (num == 1) return false;
        for (int i =2; i<num; i++) { //2 < 2 는 참이아니므로 빠짐
            if (num%i == 0) return false;
        }
        return true;
    }

    public ArrayList<Integer>  solution(int n, int[] arr) {
        ArrayList<Integer> answer = new ArrayList<>();
        for (int i = 0; i < n; i++)  {
            int tmp = arr[i];
            int res =0;
            while (tmp > 0) {
                int t = tmp%10;
                res = res*10+t;
                tmp = tmp/10;
            }
            if (isPrime(res)) answer.add(res);
        }
        return answer;
    }

    public static void main(String[] args) {
        Exam26 exam21 = new Exam26();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }
        for (int x : exam21.solution(n, arr)) {
            System.out.print(x + " ");
        }
    }

    private boolean isPrime2(int num) {
        if (num == 1) return false;
        for (int i = 2; i < num; i++) {
            if (num % i == 0) return false;
        }
        return true;
    }

    public ArrayList<Integer>  solution2(int n, int[] arr) {
        ArrayList<Integer> answer = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int tmp = arr[i];
            int res = 0;
            while (tmp > 0) {
                int t = tmp % 10;
                res = res * 10 + t;
                tmp = tmp / 10;
            }
            if (isPrime2(res)) answer.add(res);
        }
        return answer;
    }
}
