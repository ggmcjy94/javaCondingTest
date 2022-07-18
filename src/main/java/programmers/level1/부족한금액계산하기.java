package programmers.level1;

public class 부족한금액계산하기 {

    public long solution(int price, int money, int count) {
        long answer = 0;
        long sum = 0;
        for (int i = 1; i <= count; i++) {
            sum += price * i;
        }
        if (sum > money) answer = sum - money;
        return answer;
    }

    public static void main(String[] args) {
        부족한금액계산하기 T = new 부족한금액계산하기();
        System.out.println(T.solution(3, 20 , 4));
    }
}
