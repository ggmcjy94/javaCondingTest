package solved.silver5;

import java.util.*;

public class 단어정렬 {



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<String> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String next = sc.next();
            if (!arr.contains(next)) {
                arr.add(next);
            }
        }

        Collections.sort(arr, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if (o1.length() == o2.length()) {
                    return o1.compareTo(o2);
                }
                else {
                    return o1.length() - o2.length();
                }
            }
        });

        for (String s : arr) {
            System.out.println(s);
        }
    }
}
