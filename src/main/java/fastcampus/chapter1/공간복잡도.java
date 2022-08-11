package fastcampus.chapter1;

public class 공간복잡도 {


    // o (1)
    private int factorialFunc(int n) {
        int fac = 1;
        for (int i = 2; i < n + 1; i++) {
            fac *= i;
        }
        return fac;
    }

    //o(n)
    private int factorialFuncRecursive(int n) {
        if (n > 1) {
            return  n * factorialFuncRecursive(n - 1);
        } else {
            return 1;
        }
    }


    public static void main(String[] args) {
        공간복잡도 T = new 공간복잡도();
        System.out.println(T.factorialFuncRecursive(5));
    }
}
