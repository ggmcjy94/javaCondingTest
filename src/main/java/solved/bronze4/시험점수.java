package solved.bronze4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class 시험점수 {

    static class Subject {
        int info, math,science,english, max;

        public Subject(int info, int math, int science, int english, int max ) {
            this.info = info;
            this.math = math;
            this.science = science;
            this.english = english;
            this.max = max;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Subject> subjects = new ArrayList<>();

        for (int i = 0; i < 2; i++) {
            int s = sc.nextInt();
            int m = sc.nextInt();
            int se = sc.nextInt();
            int e = sc.nextInt();
            int max = s + m + se + e;
            subjects.add(new Subject(s, m, se, e, max));
        }
        System.out.println(Math.max(subjects.get(0).max, subjects.get(1).max));

    }
}
