package programmers.level2;

public class 땅따먹기 {

    int solution(int[][] land) {
        int answer = 0;
        for (int i = 1; i < land.length; i++) {
            land[i][0] += Math.max(land[i - 1][1], Math.max(land[i - 1][2], land[i - 1][3]));
            land[i][1] += Math.max(land[i - 1][0], Math.max(land[i - 1][2], land[i - 1][3]));
            land[i][2] += Math.max(land[i - 1][0], Math.max(land[i - 1][1], land[i - 1][3]));
            land[i][3] += Math.max(land[i - 1][0], Math.max(land[i - 1][1], land[i - 1][2]));
        }

        for (int i = 0; i < land.length; i++) {
            for (int j = 0; j < land[0].length; j++) {
                System.out.print(land[i][j] + "");
            }
            System.out.println();
        }

        for (int i : land[land.length - 1]) {
            System.out.println(i);
            answer = Math.max(answer, i);
        }
        return answer;
    }
}
