package solved.bronze2;

import java.util.HashMap;
import java.util.Scanner;

public class 농구경기 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        String[] arr = new String[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.next();
        }

        boolean check = false;
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            map.put(arr[i].charAt(0), map.getOrDefault(arr[i].charAt(0),0) + 1);
        }
        for (Character character : map.keySet()) {
            Integer integer = map.get(character);
            if (integer >= 5) {
                check = true;
                System.out.print(character);
            }
        }
        if (!check) {
            System.out.println("PREDAJA");
        }
    }
}
