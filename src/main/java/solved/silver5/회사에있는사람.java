package solved.silver5;


import java.util.*;

public class 회사에있는사람 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        Set<String> set = new HashSet<>();
        for (int i = 0; i<N; i++) {
            String name = sc.next();
            String commute = sc.next();
            if (commute.equals("enter")) {
                set.add(name);
            } else {
                set.remove(name);
            }
        }
        List<String> list = new ArrayList<>(set);
        Collections.sort(list, Collections.reverseOrder());
        for (String s : list) {
            System.out.println(s);
        }
    }
}
