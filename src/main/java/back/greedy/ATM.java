package back.greedy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ATM {

    static class Data implements Comparable<Data>{
        Integer id;
        Integer value;

        public Data(Integer id, Integer value) {
            this.id = id;
            this.value = value;
        }

        @Override
        public int compareTo(Data o) {
            return this.value - o.value;
        }
    }
    static int solution(ArrayList<Data> data) {
        Collections.sort(data);
        int sum = 0, answer = 0;
        for (Data datum : data) {
            sum = sum + datum.value;
            answer += sum;
        }
        return answer;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        ArrayList<Data> dataList = new ArrayList<>();
        for (int i = 1; i <= N; i++) {
            int value = sc.nextInt();
            dataList.add(new Data(i, value));
        }
        System.out.println(solution(dataList));
    }
}
