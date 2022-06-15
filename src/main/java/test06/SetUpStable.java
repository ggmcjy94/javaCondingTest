package test06;

import java.util.Arrays;
import java.util.Scanner;




/**
 * 마구간 정하기 (결정 알고리즘)
 */
public class SetUpStable {

    private int count(int[] arr, int dist) {
        int cnt = 1;
        int ep = arr[0]; //1 2 4 8 9

        for (int i = 1; i < arr.length; i++) {
            if (arr[i]-ep >= dist) { //2
                cnt++; // 2 3 4
                ep = arr[i]; // 8 4 8
            }
        }
        return cnt;
    }

    private int solution(int n, int c, int[] arr) {
        int answer = 0;
        Arrays.sort(arr);//12489
        int lt = 1;
        int rt = arr[n-1];
        while (lt <= rt) {
            int mid = (lt + rt) /2;
            if (count(arr,mid) >= c) {
                answer = mid;
                lt = mid + 1;
            } else {
                rt = mid - 1;
            }
        }
        return answer;
    }



    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int m = kb.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = kb.nextInt();
        SetUpStable musicVideo = new SetUpStable();
        System.out.println(musicVideo.solution(n,m,arr));
    }


}
