package programmers.solution;

public class 나머지한점 {
    public int[] solution(int[][] v) {
        int x = 0, y = 0;
        if (v[2][0] == v[0][0]) {
            x = v[1][0];
        } else if(v[1][0] == v[2][0]) {
            x = v[0][0];
        } else if(v[1][0] == v[0][0]) {
            x = v[2][0];
        }

        if (v[2][1] == v[0][1]) {
            y = v[1][1];
        } else if(v[1][1] == v[2][1]) {
            y = v[0][1];
        } else if(v[1][1] == v[0][1]) {
            y = v[2][1];
        }
        int[] answer = {x, y};
        return answer;
    }
}
