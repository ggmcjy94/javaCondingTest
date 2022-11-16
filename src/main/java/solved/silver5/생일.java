package solved.silver5;

import java.util.*;

public class 생일 {

    static class Birth {
        String name;
        int day, month, year;

        public Birth(String name, int day, int month, int year) {
            this.name = name;
            this.day = day;
            this.month = month;
            this.year = year;
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Birth> birthList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String name = sc.next();
            int day = sc.nextInt();
            int month = sc.nextInt();
            int year = sc.nextInt();
            birthList.add(new Birth(name, day, month, year));
        }
        Collections.sort(birthList, new Comparator<Birth>() {
            @Override
            public int compare(Birth birth, Birth t1) {
                int value = t1.year - birth.year;
                if (t1.year == birth.year) {
                    value = t1.month - birth.month;
                }
                if (t1.month == birth.month) {
                    value = t1.day - birth.day;
                }
                return value;
            }
        });
        System.out.println(birthList.get(0).name);
        System.out.println(birthList.get(birthList.size()-1).name);

    }
}
