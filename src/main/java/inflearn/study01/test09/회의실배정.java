package inflearn.study01.test09;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Time implements Comparable<Time> {

    public int s, e;

    public Time(int s, int e) {
        this.s = s;
        this.e = e;
    }
    @Override
    public int compareTo(Time o) {
        if (this.e == o.e) return this.s - o.s;
        else return this.e - o.e;
    }
}

public class 회의실배정 {
    private int solution(int n, ArrayList<Time> arr) {
        int cnt = 0;
        Collections.sort(arr);
        int et = 0;
        for (Time time : arr) {
            if (time.s >= et) {
                cnt++;
                et = time.e;
            }
        }
        return cnt;
    }

    public static void main(String[] args) {
        회의실배정 T = new 회의실배정();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        ArrayList<Time> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int s = kb.nextInt();
            int e = kb.nextInt();
            arr.add(new Time(s, e));
        }
        System.out.println(T.solution(n,arr));
    }




}
