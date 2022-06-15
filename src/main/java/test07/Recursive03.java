package test07;

import java.util.Scanner;

/**
 * 재귀함수 (팩토리얼)
 */
public class Recursive03 {

    private int DFS(int n) {
        if (n == 1) return 1;
        else {
            return n * DFS(n-1);
        }
    }

    public static void main(String[] args) {
        Recursive03 recursive01 = new Recursive03();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(recursive01.DFS(n));
    }


}
