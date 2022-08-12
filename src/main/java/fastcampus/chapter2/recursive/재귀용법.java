package fastcampus.chapter2.recursive;

import java.util.ArrayList;

public class 재귀용법 {

    public static void main(String[] args) {
        재귀용법 T = new 재귀용법();
        System.out.println(T.factorialFuncRecursive1(5));

        ArrayList<Integer> dataList = new ArrayList<>();
        for (int i = 0; i <10; i++) {
            dataList.add(i);
        }

        System.out.println(T.factorialFuncRecursive3(dataList));
    }

    private int factorialFuncRecursive1(int i) {
        if (i > 1) {
            return i * factorialFuncRecursive1(i - 1);
        } else {
            return 1;
        }
    }

    private int factorialFuncRecursive2(int i) {
        if (i <= 1) {
            return 1;
        }
        return i * factorialFuncRecursive2(i - 1);
    }

    private int factorialFuncRecursive3(ArrayList<Integer> dataList) {
        if (dataList.size() <= 0) {
            return 0;
        }
        return dataList.get(0) + this.factorialFuncRecursive3(new ArrayList<Integer>(dataList.subList(1, dataList.size())));
    }

    private int factorialFuncRecursive4(int n) {
        if (n == 1) {
            return 1;
        } else if (n == 2) {
            return 2;
        } else if (n == 3) {
            return 4;
        }
        return factorialFuncRecursive4(n-1) + factorialFuncRecursive4(n - 2) + factorialFuncRecursive4(n - 3);
    }

}
