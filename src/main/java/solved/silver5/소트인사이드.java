package solved.silver5;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class 소트인사이드 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.next();
        int[] arr = new int[n.length()];


        for (int i = 0; i < n.length(); i++) {
            arr[i] = Integer.parseInt(String.valueOf(n.charAt(i)));
        }
        Integer[] arr2 = Arrays.stream(arr).boxed().toArray(Integer[]::new);
        Arrays.sort(arr2, Collections.reverseOrder());

        for (int i : arr2) {
            System.out.print(i);
        }
    }
}
