package inflearn.study01.test09;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;



class Body implements Comparable<Body> { //좌표 정렬
    public int h, w;

    public Body(int h, int w) {
        this.h = h;
        this.w = w;
    }

    @Override
    public int compareTo(Body o) {
        return o.h - this.h; //키 기준
    }
}

public class 씨름선수 {

    private int solution(ArrayList<Body> arr, int n) {
        int cnt = 0;
        Collections.sort(arr); //내림차순
        int max = Integer.MIN_VALUE;
        for (Body o : arr) {
            if (o.w > max) {
                max = o.w;
                cnt++;
            }
        }
        return cnt;
    }


    public static void main(String[] args) {
        씨름선수 T = new 씨름선수();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        ArrayList<Body> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int h = kb.nextInt();
            int w = kb.nextInt();
            arr.add(new Body(h, w));
        }
        System.out.println(T.solution(arr, n));

    }


}
