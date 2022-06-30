package programmers;
import java.util.Arrays;

public class 체육복 {

    public int solution(int n, int[] lost, int[] reserve) {
        Arrays.sort(lost);
        Arrays.sort(reserve);

        int answer = n - lost.length;
        int llen = lost.length;
        int rlen = reserve.length;

        for(int i = 0; i < llen; i++) {
            for(int j = 0; j < rlen; j++) {
                if(lost[i] == reserve[j]) {
                    answer++;
                    reserve[j] = -100;
                    lost[i] = -100;
                    break;
                }
            }
        }

        for(int l : lost) {
            for(int i = 0; i < rlen; i++) {
                if(l == reserve[i]-1 || l == reserve[i]+1) {
                    answer += 1;
                    reserve[i] = -1;
                    break;
                }
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        체육복 T = new 체육복();
        int[] lost = {2, 4};
        System.out.println(lost[0]++);
        System.out.println(lost[0]);
        System.out.println(T.solution(5 , lost, new int[]{1,3,5}));

    }
}
