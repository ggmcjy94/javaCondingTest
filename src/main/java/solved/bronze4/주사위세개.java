package solved.bronze4;

import java.util.*;

public class 주사위세개 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //같은 눈이 3개가 나오면 10,000원+(같은 눈)×1,000원의 상금을 받게 된다. o
        //같은 눈이 2개만 나오는 경우에는 1,000원+(같은 눈)×100원의 상금을 받게 된다.
        //모두 다른 눈이 나오는 경우에는 (그 중 가장 큰 눈)×100원의 상금을 받게 된다. o
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(n1);
        arr.add(n2);
        arr.add(n3);
        Collections.sort(arr, Collections.reverseOrder());
        if (n1 == n2 && n2 == n3) {
            System.out.println(10000+n1*1000);
        } else if (n1 != n2 && n2 != n3 && n1 != n3) {
            System.out.println(arr.get(0) * 100);
        } else {
            for (int i = 0; i < arr.size() - 1; i++) {
                for (int j = i + 1; j < arr.size(); j++) {
                    if (Objects.equals(arr.get(i), arr.get(j))) {
                        System.out.println(1000 + arr.get(i) * 100);
                        break;
                    }
                }
            }
        }
    }
}
