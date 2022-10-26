package programmers.solution;

public class 가장큰정사각형 {

    public int solution(int [][]board) {
        int[][] dp = new int[1001][1001];
        int answer = 0;
        int row = board.length;
        int col = board[0].length;

        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= col; j++) {
                if (board[i-1][j-1] != 0){
                    // board[i][j]의 왼쪽 상단, 왼쪽, 위쪽 중 최솟값 구해서 +1 후 할당
                    dp[i][j] = Math.min(dp[i][j-1], Math.min(dp[i-1][j], dp[i-1][j-1]))+1;
                    // 그 중 최댓값을 answer에 할당
                    answer = Math.max(answer, dp[i][j]);
                }
            }
        }
        return answer * answer;
    }
}
