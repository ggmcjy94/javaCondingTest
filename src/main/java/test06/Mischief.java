package test06;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 * 장난 꾸러기 문제
 */
public class Mischief {


    public static void main(String[] args) {
        Mischief mi = new Mischief();
        Scanner kb  = new Scanner(System.in);
        int n = kb.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) arr[i] = kb.nextInt();
        for (int i : mi.solution(n,arr)) System.out.print(i + " ");
    }

    private ArrayList<Integer> solution(int n, int[] arr) {
        ArrayList<Integer> answer = new ArrayList<>();
        int[] tmp = arr.clone(); //깊은복사
        Arrays.sort(tmp);
        for (int i = 0; i < n; i++) {
            if (arr[i] != tmp[i]) {
                answer.add(i + 1);
            }
        }
        return answer;
    }


}
