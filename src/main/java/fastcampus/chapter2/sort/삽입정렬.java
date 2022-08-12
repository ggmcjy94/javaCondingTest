package fastcampus.chapter2.sort;

import java.util.ArrayList;
import java.util.Collections;

public class 삽입정렬 {


    public static void main(String[] args) {
        ArrayList<Integer> dataList = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            dataList.add((int) (Math.random()*100));
        }

        for (int i = 0; i < dataList.size()-1; i++) {
            for (int j = i + 1; j > 0; j--) {
                if (dataList.get(j) < dataList.get(j-1)) {
                    Collections.swap(dataList, j, j-1);
                } else {
                    break;
                }
            }
        }
        System.out.println(dataList);
    }
}
