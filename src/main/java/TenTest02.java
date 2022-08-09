import java.util.Scanner;


public class TenTest02 {

    static int n, m;
    static String[] friends;
    static String[][] movies;

    private void BFS() {

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();

        friends = new String[n];
        for (int i = 0; i < n; i++) {
            friends[i] = sc.next();
        }

        movies = new String[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                movies[i][j] = sc.next();
            }
        }
    }
}
