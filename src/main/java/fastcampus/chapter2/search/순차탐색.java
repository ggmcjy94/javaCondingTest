package fastcampus.chapter2.search;

import java.util.ArrayList;


/**
 * o(n)
 */
public class 순차탐색 {


    private int searchFunc(ArrayList<Integer> dataList, int searchItem) {
        for (Integer list : dataList) {
            if (list == searchItem) return list;
        }
        return -1;
    }

    public static void main(String[] args) {
        순차탐색 T = new 순차탐색();
        ArrayList<Integer> dataList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            dataList.add((int) (Math.random()*20));
        }
        System.out.println(T.searchFunc(dataList, 19));
    }



}
