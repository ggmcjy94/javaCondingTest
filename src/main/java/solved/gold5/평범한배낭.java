package solved.gold5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class 평범한배낭 {

    static class Bag implements Comparable<Bag>{
        int w, v;

        public Bag(int w, int v) {
            this.w = w;
            this.v = v;
        }

        @Override
        public int compareTo(Bag bag) {
            return bag.v/bag.w - this.v/this.w;
        }
    }

    static int pro(ArrayList<Bag> arr, int k) {
        Collections.sort(arr);
        int sum = 0;

//        6 13
//        4 8
//        3 6
//        5 12

        for (Bag bag : arr) {
            k -= bag.w;
            if (k >= bag.w) {
                sum += bag.v;
            }
            System.out.println(sum);
        }

        return 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        ArrayList<Bag> arr = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            int w = sc.nextInt();
            int v = sc.nextInt();
            arr.add(new Bag(w, v));
        }

        pro(arr, K);
    }
}
