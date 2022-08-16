import java.util.*;


class Items {
    String item;
    Integer weight;
    Integer value;

    public Items(String item, Integer weight, Integer value) {
        this.item = item;
        this.weight = weight;
        this.value = value;
    }
}

public class TenTest01 {

    public static void main(String[] args) {
        TenTest01 T = new TenTest01();
        Scanner sc = new Scanner(System.in);
        int W = sc.nextInt();
        int N = sc.nextInt();

        ArrayList<Items> items = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            String item = sc.next();
            Integer weight = sc.nextInt();
            Integer value = sc.nextInt();
            items.add(new Items(item, weight, value));
        }

        String[][] solution = T.solution(items, W, N);
        for (int i = 0; i < solution.length; i++) {
            for (int j = 0; j < solution[i].length; j++) {
                System.out.println(solution[i][j]);
            }
        }
    }

    private String[][] solution(ArrayList<Items> items, int w, int n) {

        double totalValue = 0.0;
        Integer totalCount = 0;
        int weight = w;
        ArrayList<String> tem = new ArrayList<>();

        items.sort((o1, o2) -> (o2.value / o2.weight) - (o1.value / o2.weight));

        for (Items item : items) {
            if ((weight - (double)item.weight) > 0) {
                tem.add(item.item);
                weight -= item.weight;
                totalValue += item.value;
                totalCount += 1;
            }
        }

        String[] str = new String[tem.size()];
        for (int i = 0; i < str.length; i++) {
            str[i] = tem.get(i);
        }

        return new String[][]{
                {String.valueOf(w), String.valueOf((int) totalValue), String.valueOf(totalCount)}
                ,str
        };
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
