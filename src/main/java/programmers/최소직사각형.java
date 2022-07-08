package programmers;

import java.util.ArrayList;
import java.util.List;


class Square{
    int w;
    int h;

    public Square(int w, int h) {
        this.w = w;
        this.h = h;
    }
}
public class 최소직사각형 {

    public int solution(int[][] sizes) {
        int answer = 0;
        List<Square> squares = new ArrayList<>();
        for (int i = 0; i < sizes.length; i++) {
            if (sizes[i][0] < sizes[i][1]) {
                int tmp = 0;
                tmp = sizes[i][0];
                sizes[i][0] = sizes[i][1];
                sizes[i][1] = tmp;
            }
            squares.add(new Square(sizes[i][0], sizes[i][1]));
        }
        int maxW = 0;
        int maxH = 0;
        for (Square square : squares) {
            maxW = Math.max(maxW, square.w);
            maxH = Math.max(maxH, square.h);
        }
        answer = maxW * maxH;
        return answer;
    }

    public static void main(String[] args) {
        최소직사각형 T = new 최소직사각형();
        System.out.println(T.solution(new int[][]{{60, 50}, {30, 70}, {60, 30}, {80, 40}}));
    }

}
