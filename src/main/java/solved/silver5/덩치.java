package solved.silver5;

//브루트 포스 그냥 전부 돌면서 답을 찾는 행위
import java.util.ArrayList;
import java.util.Scanner;

public class 덩치 {

    static class Body {
        int w,h;

        public Body(int w, int h) {
            this.w = w;
            this.h = h;
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        ArrayList<Body> arr = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            int w = sc.nextInt();
            int h = sc.nextInt();
            arr.add(new Body(w, h));
        }

        for (int i = 0; i < N; i++) {
            int rank = 1;

            for (int j = 0; j < N; j++) {
                if (i == j) continue;

                if (arr.get(i).w < arr.get(j).w && arr.get(i).h < arr.get(j).h) {
                    rank++;
                }
            }
            System.out.print(rank + " ");
        }
    }
}
