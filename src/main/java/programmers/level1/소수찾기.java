package programmers.level1;

public class 소수찾기 {

    public int solution(int n) {
        int answer = 0;
        boolean[] check = new boolean[n+1];

        for (int i = 2; i <= n; i++) {
            if (check[i] == true) continue;

            for (int j = i + i; j <= n; j += i) {
                check[j] = true;
            }
        }

        for (int i = 2; i <= n; i++){
            if (!check[i]) answer++;
        }
        return answer;
    }

}
