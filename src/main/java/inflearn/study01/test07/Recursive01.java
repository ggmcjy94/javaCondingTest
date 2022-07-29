package inflearn.study01.test07;

import java.util.Scanner;

/**
 * 재귀함수 (스택프레임)
 */
public class Recursive01 {

    private void DFS(int n) {
        if (n == 0)  return;
        else {
            DFS(n-1);
            System.out.print(n + " ");
        }
    }

    public static void main(String[] args) {

        Recursive01 recursive01 = new Recursive01();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        recursive01.DFS(n);
    }


}
