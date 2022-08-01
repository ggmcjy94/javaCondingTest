package programmers.level1;

public class 정수제곱근판별 {

    public long solution(long n) {
        long answer = (long) Math.sqrt(n);
        if (answer * answer == n) {
            return (answer + 1) * (answer + 1);
        } else {
            return -1;
        }

    }

    public static void main(String[] args) {
        정수제곱근판별 T = new 정수제곱근판별();
        System.out.println(T.solution(3));
    }
}
