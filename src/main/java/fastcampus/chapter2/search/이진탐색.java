package fastcampus.chapter2.search;

import java.util.ArrayList;
import java.util.Collections;


/* backlog ready in progress in review done
o(logn)
 */
public class 이진탐색 {

    public static void main(String[] args) {
        이진탐색 T = new 이진탐색();
        ArrayList<Integer> dataList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            dataList.add((int) (Math.random()*20));
        }

        System.out.println(T.binarySearch(dataList, 19));
    }

    private boolean binarySearch(ArrayList<Integer> dataList, Integer searchItem) {
        Collections.sort(dataList);
        if (dataList.size() == 1 && searchItem == dataList.get(0)) return true;
        if (dataList.size() == 1 && searchItem != dataList.get(0)) return false;
        if (dataList.size() == 0) return false;

        int medium = dataList.size()/2;
        if (searchItem == dataList.get(medium)) {
            return true;
        } else {
            if (searchItem < dataList.get(medium)) {
                return this.binarySearch(new ArrayList<>(dataList.subList(0, medium)), searchItem);
            } else {
                return this.binarySearch(new ArrayList<>(dataList.subList(medium, dataList.size())), searchItem);
            }
        }
    }
}
