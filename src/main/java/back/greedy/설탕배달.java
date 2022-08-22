package back.greedy;

import java.util.Scanner;

public class 설탕배달 {

    static int solution(int n) {
        int answer = 0;
        while (true) {
            if (n % 5 == 0) {
                answer = answer + n/5;
                break;
            } else {
                n -= 3;
                answer++;
            }
            if (n < 0) {
                return -1;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        System.out.println(solution(N));
    }
}
