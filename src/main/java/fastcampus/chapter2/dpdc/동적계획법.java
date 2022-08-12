package fastcampus.chapter2.dpdc;

public class 동적계획법 {

    private int factorialFunc(int data) {
        if (data <= 1) return data;
        return factorialFunc(data - 1) + factorialFunc(data - 2);
    }


    private int dynamicFunc(int data) {
        Integer[] cache = new Integer[data + 1];
        cache[0] = 0;
        cache[1] = 1;
        for (int index = 2; index <= data; index++) {
            cache[index] = cache[index-1] + cache[index - 2];
        }
        return cache[data];
    }

    public static void main(String[] args) {
        동적계획법 T = new 동적계획법();
        System.out.println(T.factorialFunc(10));
        System.out.println(T.dynamicFunc(10));
    }
}
