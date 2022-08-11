package fastcampus.chapter2;

import java.util.ArrayList;
import java.util.Collections;

public class 선택정렬 {

    public static void main(String[] args) {
        ArrayList<Integer> dataList = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            dataList.add((int) (Math.random()*100));
        }


        for (int i = 0; i < dataList.size() - 1; i++) {
            for (int j = i + 1; j < dataList.size(); j++) {
                if (dataList.get(i) >= dataList.get(j)) {
                    Collections.swap(dataList, i , j);
                }
            }
        }
        System.out.println(dataList);
    }
}
