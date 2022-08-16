package fastcampus.chapter2.greedy;

import java.util.ArrayList;
import java.util.Arrays;

public class 탐욕알고리즘 {

    private void coinFunc(Integer price, ArrayList<Integer> coinList) {
        Integer totalCoinCount = 0;
        Integer coinNum = 0;
        ArrayList<Integer> details  = new ArrayList<>();

        for (int i = 0; i < coinList.size(); i++) {
            coinNum = price / coinList.get(i);
            totalCoinCount += coinNum;
            price -= coinNum * coinList.get(i);
            details.add(coinNum);
            System.out.println(coinList.get(i) + "원: " + coinNum + "개");
        }
        System.out.println("총 동전 갯수 : " + totalCoinCount);
    }


    public static void main(String[] args) {
        탐욕알고리즘 T = new 탐욕알고리즘();
        ArrayList<Integer> coinList = new ArrayList<>(Arrays.asList(500,100,50,1));
        T.coinFunc(4720, coinList);
    }
}
