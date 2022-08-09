package fastcampus.chapter1;

public class 시간복잡도 {

    public static void main(String[] args) {
        //o(n)
        int total = 0;
        int n = 10;
        for (int i = 1; i <= n; i++) {
            total += i;
        }
        System.out.println(total);

        // o(1)
        System.out.println(n*(n+1)/2);
    }
}
