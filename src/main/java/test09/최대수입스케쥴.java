package test09;

import java.util.ArrayList;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

/**
 * PriorityQueue 응용문제
 */

class Lecture implements Comparable<Lecture> {
    public int money, date;

    public Lecture(int m, int d) {
        this.money = m;
        this.date = d;
    }

    @Override
    public int compareTo(Lecture o) {
        return o.date - this.date;
    }
}

public class 최대수입스케쥴 {

    static int n, max  = Integer.MIN_VALUE;

    private int solution(ArrayList<Lecture> arr) {
        int answer = 0;
        PriorityQueue<Integer> pQ = new PriorityQueue<>(Collections.reverseOrder());
        Collections.sort(arr);
        int j = 0;
        for (int i=max; i >= 1; i--) {
            for ( ; j < n; j++){
                if (arr.get(j).date < i) break; // i 는 date
                pQ.add(arr.get(j).money);
            }
            if (!pQ.isEmpty()) answer += pQ.poll();
        }
        return answer;
    }

    public static void main(String[] args) {
        최대수입스케쥴 T = new 최대수입스케쥴();
        Scanner kb = new Scanner(System.in);
        n = kb.nextInt();
        ArrayList<Lecture> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int m = kb.nextInt();
            int d = kb.nextInt();
            arr.add(new Lecture(m, d));
            if (d > max) max = d; //날짜 중 제일 큰 돈의 값
        }

        System.out.println(T.solution(arr));
    }


}
