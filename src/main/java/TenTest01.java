import java.util.*;

class Luggage implements Comparable<Luggage>{
    String tName;
    int weight, value;
    public Luggage(String tName, int weight, int value) {
        this.tName = tName;
        this.weight = weight;
        this.value = value;
    }
    @Override
    public int compareTo(Luggage o) {
        int c = Integer.compare(this.weight, o.weight);
        if (c == 0) {
            return Integer.compare(value, o.value);
        }
        return c;
    }
}

public class TenTest01 {
    private String[][] solution(int w, int n, List<Luggage> items) {
        int maxValue = Integer.MIN_VALUE;
        Collections.sort(items);
        int[][] back = new int[n+1][w+1];
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= w-1; j++) {
                Luggage l = items.get(i - 1);
                if (l.weight > j) {
                    back[i][j] = back[i-1][j];
                } else {
                    back[i][j] = Math.max(back[i-1][j], l.value + back[i-1][j-l.weight]);
                    System.out.println(back[i][j]);
                }
                maxValue = Math.max(maxValue, back[i][j]);

            }
        }
        return new String[][] {
                {String.valueOf(Integer.valueOf(w)), String.valueOf(Integer.valueOf(maxValue)), String.valueOf(Integer.valueOf(items.size()))},
                {}
        };
    }

    public static void main(String[] args) {

        TenTest01 T = new TenTest01();
        Scanner sc = new Scanner(System.in);
        List<Luggage> items = new ArrayList<>();
        int w = sc.nextInt();
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            String s = sc.next();
            int weight = sc.nextInt();
            int value = sc.nextInt();
            items.add(new Luggage(s, weight, value));
        }
        System.out.println(Arrays.deepToString(T.solution(w, n, items)));
    }
}

/**
12 5
camera 5 10
smartphone 2 20
cup 3 5
towel 4 7
pants 6 11
 */
