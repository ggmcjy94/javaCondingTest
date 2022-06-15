package test07;

import java.util.Scanner;

/**
 * 재귀함수 (스택프레임)
 */
public class Recursive02 {

    private void DFS(int n) {
        if (n == 0) return;
        else {
            DFS(n / 2);
            System.out.print(n % 2);
        }
    }

    public static void main(String[] args) {
        Recursive02 recursive01 = new Recursive02();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        recursive01.DFS(n);
    }


}
