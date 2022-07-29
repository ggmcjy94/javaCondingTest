package inflearn.study01.test06;

import java.util.*;

/**
 * 좌표 정렬
 */
public class CoordinateAlignment {

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        ArrayList<Point> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int x = kb.nextInt();
            int y = kb.nextInt();
            arr.add(new Point(x, y));
        }
        Collections.sort(arr);
        for (Point o : arr) {
            System.out.println(o.x+" " + o.y);
        }
    }
}

class Point implements Comparable<Point> {
    public int x, y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public int compareTo(Point o) {
        if (this.x == o.x) {
            return this.y - o.y; // 오름 차순
            //내림차순 return o.y - this.y;
        } else  {
            return this.x - o.x;
            //내림차순 return o.x - this.x;
        }


    }
}
