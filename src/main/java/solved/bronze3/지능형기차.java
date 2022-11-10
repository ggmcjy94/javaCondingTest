package solved.bronze3;

import java.util.ArrayList;
import java.util.Scanner;

public class 지능형기차 {
    static class Train {
        int In, Out;

        public Train(int in, int out) {
            In = in;
            Out = out;
        }

        public int getIn() {
            return In;
        }

        public int getOut() {
            return Out;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int max = Integer.MIN_VALUE;
        int n = 4;
        ArrayList<Train> trains = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int out = sc.nextInt();
            int in = sc.nextInt();
            trains.add(new Train(in, out));
        }
        int sum = 0;
        for (Train train : trains) {
            int num = train.getIn() - train.getOut();
            sum += num;
            max = Math.max(max, sum);
        }
        System.out.println(max);
     }
}
