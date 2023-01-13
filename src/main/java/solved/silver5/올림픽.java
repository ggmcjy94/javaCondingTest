package solved.silver5;

import java.util.*;

public class 올림픽 {
    static class Country {
        int id,gd,sv,don;

        public Country(int id, int gd, int sv, int don) {
            this.id = id;
            this.gd = gd;
            this.sv = sv;
            this.don = don;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();

        List<Country> countries = new ArrayList<>();
        for (int i=0; i<N; i++) {
            int id = sc.nextInt();
            int gd = sc.nextInt();
            int sv = sc.nextInt();
            int don = sc.nextInt();
            countries.add(new Country(id, gd, sv, don));
            
        }
        countries.sort((country, t1) -> {
            if (country.gd == t1.gd) {
                return t1.sv - country.sv;
            } else if (t1.sv == country.sv) {
                return t1.don - country.don;
            }
            return t1.gd - country.gd;
        });
    }
}
