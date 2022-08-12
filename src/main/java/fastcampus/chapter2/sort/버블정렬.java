package fastcampus.chapter2.sort;

import java.util.ArrayList;
import java.util.Collections;

public class 버블정렬 {

    public static void main(String[] args) {
        ArrayList<Integer> dataList = new ArrayList<Integer>();
        for (int i = 0; i < 100; i++) {
            dataList.add((int) (Math.random()*100));
        }

        for (int i = 0; i < dataList.size() - 1; i++) {
            boolean swap = false;
            for (int j = 0; j < dataList.size()-1-i; j++) {
                if (dataList.get(j) > dataList.get(j + 1)) {
                    Collections.swap(dataList, j , j+1);
                    swap = true;
                }
            }
            if (!swap) {
                break;
            }
        }
        System.out.println(dataList);
    }
}
