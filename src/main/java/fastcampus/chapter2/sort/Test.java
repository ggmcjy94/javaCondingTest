package fastcampus.chapter2.sort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class Test {


    private ArrayList<Integer> qsort(ArrayList<Integer> dataList) {
        if (dataList.size() <=1) {
            return dataList;
        }
        int pivot = dataList.get(0);

        ArrayList<Integer> leftArr = new ArrayList<>();
        ArrayList<Integer> rightArr = new ArrayList<>();

        for (int i = 1; i < dataList.size(); i++) {
            if (pivot < dataList.get(i)) {
                rightArr.add(dataList.get(i));
            } else {
                leftArr.add(dataList.get(i));
            }
        }
        ArrayList<Integer> mergedArr = new ArrayList<>();
        mergedArr.addAll(this.qsort(leftArr));
        mergedArr.addAll(Arrays.asList(pivot));
        mergedArr.addAll(this.qsort(rightArr));
        return mergedArr;
    }
    private ArrayList<Integer> sort(ArrayList<Integer> dataList) {

        for (int i = 0; i < dataList.size()-1; i++) {
            for (int j = i+1; j < dataList.size(); j++) {
                if (dataList.get(i) > dataList.get(j)) {
                    Collections.swap(dataList, i, j);
                }
            }
        }
        return dataList;
    }

    public static void main(String[] args) {
        Test T = new Test();
        ArrayList<Integer> dataList = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            dataList.add((int) (Math.random() * 100));
        }
        System.out.println(T.qsort(dataList));


        int n = 10;
        int[] dp = new int[n+1];
        dp[0] = 0;
        dp[1] = 1;
        dp[2] = 1;
        for (int i = 3; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        System.out.println(dp[n]);

        String answer = "aasdsaa";
        StringBuilder sb = new StringBuilder(answer);
        StringBuilder reverse = sb.reverse();

        if (answer.equals(reverse.toString())) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
}
