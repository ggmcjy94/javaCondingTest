package test09;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Party implements Comparable<Party> {

    public int time;
    public char state;

    public Party(int time, char state) {
        this.time = time;
        this.state = state;
    }

    @Override
    public int compareTo(Party o) {
        if (this.time == o.time) return this.state - o.state;
        else return this.time - o.time;
    }
}

public class 결혼식 {

    private int solution(ArrayList<Party> arr) {
        int answer = Integer.MIN_VALUE;
        int cnt = 0;
        Collections.sort(arr);
        for (Party ob : arr) {
            if (ob.state == 's') cnt++;
            else cnt--;
            answer=Math.max(answer, cnt);
        }
        return answer;
    }

    public static void main(String[] args) {
        결혼식 T = new 결혼식();
        Scanner kb = new Scanner(System.in);
        ArrayList<Party> arr= new ArrayList<>();
        int n = kb.nextInt();
        for (int i = 0; i < n; i++) {
            int s = kb.nextInt();
            int e = kb.nextInt();
            arr.add(new Party(s, 's'));
            arr.add(new Party(e, 'e'));
        }
        System.out.println(T.solution(arr));
    }


}
