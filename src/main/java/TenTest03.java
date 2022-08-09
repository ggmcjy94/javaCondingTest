import java.util.Scanner;
import java.util.Stack;

public class TenTest03 {


    private int solution(int n, int[] numbers) {
        int answer = 0;
        int c = 0;
        int y = 0;
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < n; i++) {
            stack.push(numbers[i]);

        }
        return answer;
    }


    public static void main(String[] args) {
        TenTest03 T = new TenTest03();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] numbers = new int[n];
        for (int i = 0; i < n; i++) {
            numbers[i] = sc.nextInt();
        }
        System.out.println(T.solution(n, numbers));

    }

}
