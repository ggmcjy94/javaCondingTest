package test03;

import java.util.Scanner;

public class Exam36 {

    public int solution(int n, int k, int[] arr) {
        int answer = 0,cnt=0,lt=0;
        for (int rt=0; rt < n; rt++) { //rt 는 밀고 나간다
            if (arr[rt] == 0) cnt ++;
            while (cnt > k) {
                if (arr[lt] == 0) cnt--;
                lt++; //lt 가 따라간다  cnt 가 k 보다 클때
            }
            answer = Math.max(answer, rt-lt+1); //0 부터 시작하니깐 +1
        }
        return answer;
    }
    public int solution2(int n, int k, int[] arr) {
        int answer = 0, cnt = 0 , lt = 0;
        for (int rt = 0;  rt < n; rt++) {
            if (arr[rt] == 0) cnt++;
            while (cnt > k) {
                if (arr[lt] == 0) cnt--;
                lt++;
            }
            answer = Math.max(answer, rt -lt +1);
        }
        return answer;
    }
    public static void main(String[] args) {
        Exam36 exam21 = new Exam36();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(exam21.solution(n,k,arr));
    }
}
