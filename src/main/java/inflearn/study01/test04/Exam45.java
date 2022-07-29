package inflearn.study01.test04;

import java.util.Collections;
import java.util.Scanner;
import java.util.TreeSet;

public class Exam45 {

    public int solution2(int n, int k, int[] arr) {
        int answer = -1;
        TreeSet<Integer> Tset = new TreeSet<>(Collections.reverseOrder()); //내림차순
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                for (int l = j+1; l < n; l++) {
                    Tset.add(arr[i]+arr[j]+arr[l]);
                }
            }
        }
        int cnt = 0;
//        Tset.remove(143); //제거
//        Tset.size(); // 갯수
        System.out.println(Tset.first()); //오름차순 최솟값 내림차순 최댓값 (첫번째값)
        System.out.println(Tset.last()); //(마지막 값)
        for(int x : Tset) {
            System.out.println(x);
            cnt++;
            if (cnt == k) return x; //바로 리턴 아니면 -1;
        }
        return answer;
    }

    public int solution(int n, int k, int[] arr) {
        int answer = -1;
        TreeSet<Integer> Tset = new TreeSet<>(Collections.reverseOrder()); //내림차순
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                for (int l = j+1; l < n; l++) {
                    Tset.add(arr[i]+arr[j]+arr[l]);
                }
            }
        }
        int cnt = 0;
        for(int x : Tset) {
            cnt++;
            if (cnt == k) return x; //바로 리턴 아니면 -1;
        }
        return answer;
    }


    public static void main(String[] args) {
        Exam45 exam21 = new Exam45();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr= new int[n];
        for (int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(exam21.solution(n, k, arr));
    }
}
