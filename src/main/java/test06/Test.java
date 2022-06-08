package test06;

public class Test {

    public static void main(String[] args) {
        int[] arr = new int[]{0 , 1 , 2 , 3 , 4};

        int tmp = arr[0];
        arr[0] = arr[4];
        arr[4] = tmp;

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
