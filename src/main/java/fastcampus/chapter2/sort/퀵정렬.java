package fastcampus.chapter2.sort;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * 분할 정복
 */
public class 퀵정렬 {

    private ArrayList<Integer> sort(ArrayList<Integer> dataList) {
        if (dataList.size() <= 1 ) {
            return dataList;
        }
        int pivot = dataList.get(0);

        ArrayList<Integer> leftArr = new ArrayList<>();
        ArrayList<Integer> rightArr = new ArrayList<>();

        for (int i = 1; i < dataList.size(); i++) {
            if (dataList.get(i) < pivot) {
                leftArr.add(dataList.get(i));
            } else {
                rightArr.add(dataList.get(i));
            }
        }

        ArrayList<Integer> mergedArr = new ArrayList<>();
        mergedArr.addAll(this.sort(leftArr));
        mergedArr.addAll(Arrays.asList(pivot));
        mergedArr.addAll(this.sort(rightArr));

        return mergedArr;
    }

    public static void main(String[] args) {
        퀵정렬 T = new 퀵정렬();
        ArrayList<Integer> dataList = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            dataList.add((int) (Math.random() * 100));
        }
        System.out.println(T.sort(dataList));
    }
}
