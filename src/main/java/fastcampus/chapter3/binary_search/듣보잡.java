package fastcampus.chapter3.binary_search;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
public class 듣보잡 {
    static ArrayList<String> answer = new ArrayList<>();
    static void solution(String[] li, String ea) {
        int l = 0;
        int r = li.length -1;
        int mid = 0;
        while (l <= r) {
            mid = (l+r) / 2;
            if (li[mid].equals(ea)) {
                answer.add(li[mid]);
                return;
            } else if (li[mid].compareTo(ea) < 0) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        String[] li = new String[N];
        for (int i = 0; i < N; i++) {
            li[i] = sc.next();
        }
        Arrays.sort(li);
        for (int i = 0; i < M; i++) {
            solution(li, sc.next());
        }
        Collections.sort(answer);
        System.out.println(answer.size());
        for (String s : answer) {
            System.out.println(s);
        }
    }
}
