package fastcampus.chapter2.sort;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * 재귀용법을 활용
 * 분할 정복
 */
public class 병합정렬 {

    public void splitFunc(ArrayList<Integer> dataList) {
        if (dataList.size() <= 1) return;
        int medium = dataList.size()/2;

        ArrayList<Integer> leftArr = new ArrayList<>();
        ArrayList<Integer> rightArr = new ArrayList<>();

        leftArr = new ArrayList<>(dataList.subList(0 , medium)); // 0 부터 medium - 1 까지
        rightArr = new ArrayList<>(dataList.subList(medium, dataList.size())); // medium 부터 끝까지

        System.out.println(leftArr);
        System.out.println(rightArr);
    }

    private ArrayList<Integer> mergeSplitFunc (ArrayList<Integer> dataList) {
        if (dataList.size() <= 1) return dataList;
        int medium = dataList.size() / 2;

        ArrayList<Integer> leftArr;
        ArrayList<Integer> rightArr;

        leftArr = this.mergeSplitFunc(new ArrayList<>(dataList.subList(0 , medium))); // 0 부터 medium - 1 까지
        rightArr = this.mergeSplitFunc(new ArrayList<>(dataList.subList(medium, dataList.size()))); // medium 부터 끝까지
        return this.mergeFunc(leftArr, rightArr);
    }

    private ArrayList<Integer> mergeFunc(ArrayList<Integer> leftList, ArrayList<Integer> rightList) {
        ArrayList<Integer> mergedList = new ArrayList<>();
        int leftPoint = 0;
        int rightPoint = 0;

        //case 1 : left / right 둘 다 있을떄
        while (leftList.size() > leftPoint && rightList.size() > rightPoint) {
            if (leftList.get(leftPoint) > rightList.get(rightPoint)) {
                mergedList.add(rightList.get(rightPoint));
                rightPoint += 1;
            } else {
                mergedList.add(leftList.get(leftPoint));
                leftPoint += 1;
            }
        }
        //case 2 : right 데이터가 없을 떄
        while (leftList.size() > leftPoint) {
            mergedList.add(leftList.get(leftPoint));
            leftPoint+=1;
        }
        //case 3 : left 데이터가 없을 때
        while (rightList.size() > rightPoint) {
            mergedList.add(rightList.get(rightPoint));
            rightPoint+=1;
        }
        return mergedList;
    }

    public static void main(String[] args) {
        병합정렬 T = new 병합정렬();
        ArrayList<Integer> dataList = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            dataList.add((int) (Math.random() * 100));
        }
        System.out.println(T.mergeSplitFunc(dataList));
    }
}
